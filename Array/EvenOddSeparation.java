public class EvenOddSeparation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        
        int n = a.length;
        int[] result = new int[n]; // Temporary array to store result
        int left = 0, right = n - 1; // left for even numbers, right for odd numbers
        
        // Loop through the original array
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                result[left++] = a[i]; // Place even numbers at the left side
            } else {
                result[right--] = a[i]; // Place odd numbers at the right side
            }
        }
        
        // Print the result array
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + ",");
        }
    }
}
