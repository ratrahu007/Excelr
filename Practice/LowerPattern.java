public class NumberPattern {

    public static void main(String[] args) {
        
        // Loop for rows
        for (int i = 5; i >= 1; i--) {
            // Loop for numbers in each row
            for (int j = i; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line
        }
    }
}

