public class FibonacciWhileLoop {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        int first = 0, second = 1;
        int count = 0;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        while (count < n) {
            System.out.print(first + " ");
            
            // Compute the next term
            int next = first + second;
            first = second;
            second = next;
            
            count++; // Increment the loop counter
        }
    }
}
