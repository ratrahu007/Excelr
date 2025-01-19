class Isprime {

    public static void main(String[] args) {
        int count = 0;
        int[] a = {1, 3, 5, 8, 9, 11};

        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            int divisorCount = 0;  // This will count how many divisors the number has

            if (num <= 1) {
                System.out.println(num + " is Not Prime");
                continue;  // Skip checking numbers <= 1
            }

            // Check divisibility from 2 to num-1
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    divisorCount++;  // Increment count if divisible
                }
            }

            // A prime number has exactly 2 divisors: 1 and the number itself
            if (divisorCount == 0) {
                System.out.println(num + " is Prime");
                count++;  // Increment prime count
            } else {
                System.out.println(num + " is Not Prime");
            }
        }

        // Output the count of prime numbers
        System.out.println("The count of prime numbers is: " + count);
    }
}
