public class SecondMaxNumber {
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 5};

        if (a.length < 2) {
            System.out.println("Array does not have enough elements to find the second maximum.");
            return;
        }

        int max = a[0];
        int secondMax = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                secondMax = max;
                max = a[i];
            } else if (a[i] > secondMax && a[i] != max) {
                secondMax = a[i];
            }
        }

        System.out.println("Second maximum number: " + secondMax);
    }
}
