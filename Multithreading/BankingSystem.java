import java.util.Random;

class BankAccount {
    private int balance = 10000;

    // Synchronized deposit method
    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited ₹" + amount + " | New Balance: ₹" + balance);
        notify(); // Notify waiting thread
    }

    // Synchronized withdrawal method with inter-thread communication
    synchronized void withdraw(int amount) {
        while (balance < amount) {
            System.out.println(Thread.currentThread().getName() + " is waiting due to insufficient balance...");
            try {
                wait(); // Wait for deposit
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew ₹" + amount + " | New Balance: ₹" + balance);
    }

    // Get current balance
    synchronized int getBalance() {
        return balance;
    }
}

// Transaction threads
class DepositThread extends Thread {
    private BankAccount account;
    private Random random = new Random();

    DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            int amount = random.nextInt(5000) + 1000;
            account.deposit(amount);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {}
        }
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;
    private Random random = new Random();

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            int amount = random.nextInt(5000) + 1000;
            account.withdraw(amount);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }
}

// Notification Daemon Thread
class NotificationDaemon extends Thread {
    private BankAccount account;

    NotificationDaemon(BankAccount account) {
        this.account = account;
        setDaemon(true); // Set as daemon thread
    }

    public void run() {
        while (true) {
            System.out.println("📢 Notification: Current balance is ₹" + account.getBalance());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {}
        }
    }
}

// Deadlock Prevention Example
class DeadlockPrevention {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    static class SafeThread1 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1 locked Resource 1");
                try { Thread.sleep(50); } catch (InterruptedException e) {}

                synchronized (lock2) {
                    System.out.println("Thread 1 locked Resource 2");
                }
            }
        }
    }

    static class SafeThread2 extends Thread {
        public void run() {
            synchronized (lock1) { // Acquiring locks in the same order
                System.out.println("Thread 2 locked Resource 1");
                try { Thread.sleep(50); } catch (InterruptedException e) {}

                synchronized (lock2) {
                    System.out.println("Thread 2 locked Resource 2");
                }
            }
        }
    }
}

// Main Class
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Creating threads
        WithdrawThread withdrawThread = new WithdrawThread(account);
        DepositThread depositThread = new DepositThread(account);
        NotificationDaemon notificationDaemon = new NotificationDaemon(account);

        // Setting thread priorities
        withdrawThread.setPriority(Thread.MAX_PRIORITY);
        depositThread.setPriority(Thread.NORM_PRIORITY);

        // Starting threads
        notificationDaemon.start();
        withdrawThread.start();
        depositThread.start();

        try {
            withdrawThread.join();
            depositThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Deadlock Prevention Example
        DeadlockPrevention.SafeThread1 t1 = new DeadlockPrevention.SafeThread1();
        DeadlockPrevention.SafeThread2 t2 = new DeadlockPrevention.SafeThread2();
        t1.start();
        t2.start();
    }
}
