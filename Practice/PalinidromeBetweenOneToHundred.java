class PalindromeBetweenOneToHundred {

    public static void main(String[] args) {
        int count = 0;

        // Loop through numbers from 101 to 202
        for (int i = 101; i <= 105; i++) {
            int original = i;  // Store the original number
            int rev = 0;         // To store the reversed number

            // Reverse the digits of the number
            int num = i;  // Use a separate variable for number reversal
            while (num > 0) {
                int rem = num % 10;  // Get the last digit
                rev = rev * 10 + rem;  // Build the reversed number
                num = num / 10;  // Remove the last digit
            }

            // Check if the original number is equal to the reversed number
            if (original == rev) {
                count++;  // Increment the count for palindrome numbers
                System.out.println(original);  // Print the palindrome
            }
        }

        // Print the total count of palindromes
        System.out.println("Total palindromes: " + count);
    }
}
