import java.util.*;

class SubarraysExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5};
        
        // Loop to start from each index of the array
        for (int start = 0; start < arr.length; start++) {
            // Loop to end at each index after the start
            for (int end = start; end < arr.length; end++) {
                // Print the subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}

