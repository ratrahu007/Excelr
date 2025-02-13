import java.util.Random;

class BankAccount {
    private int balance = 10000;

    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + " | New Balance: " + balance);
        notify();
    }

    synchronized void withdraw(int amount) {
        while (balance < amount) {
            System.out.println(Thread.currentThread().getName() + " Insufficient Balance...");
            try {
                wait(); // Wait for deposit
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew " + amount + " | New Balance: " + balance);
    }

    // Corrected method placement
    public synchronized int getBalance() {
        return balance;
    }
}

// Transaction Threads
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
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Notification Daemon Thread
class NotificationDaemon extends Thread {
    private BankAccount account;

    NotificationDaemon(BankAccount account) {
        this.account = account;
        setDaemon(true);
    }

    public void run() {
        while (true) {
            System.out.println("Notification: Current Balance is " + account.getBalance());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



// Main Class
class RahulBankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Creating Threads
        WithdrawThread w1 = new WithdrawThread(account);
        DepositThread d1 = new DepositThread(account);
        NotificationDaemon noti = new NotificationDaemon(account);


	w1.setName("With- Draw");
	d1.setName("Deposit");
        // Setting thread priorities
        w1.setPriority(Thread.MAX_PRIORITY);
        d1.setPriority(Thread.NORM_PRIORITY);

        // Starting threads
        noti.start();
        w1.start();
        d1.start();

        try {
            w1.join();
            d1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

     
    }
}
