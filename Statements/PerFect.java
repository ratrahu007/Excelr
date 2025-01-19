class PerFect {

    public static void main(String[] args) {
        int num = 6; // Number to check
        int sum = 0;

        // Loop through all divisors (excluding the number itself)
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i; // Add the divisor to the sum
            }
        }

        // Check if the number is perfect
        if (sum == num) {
            System.out.println("Number is Perfect");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
