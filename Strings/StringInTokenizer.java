import java.util.StringTokenizer;

class StringInTokenizer {

    public static void main(String[] args) {
        // Create a StringTokenizer object with "@" as the delimiter
        StringTokenizer s1 = new StringTokenizer("viratkohli@goat", "@");

        // Print the total number of tokens
        System.out.println("Total tokens: " + s1.countTokens());

        // Iterate through the tokens
        while (s1.hasMoreTokens()) {
            System.out.println(s1.nextToken());
        }
    }
}
