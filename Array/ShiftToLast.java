import  java.util.*;

class ShiftToLast {

	public static void main ( String [] args ) 
	{
		int[] a={1,2,3,4,5};

		int n= a.length;

		int temp  = a[0];

		
		 // Shift all elements one position to the left
        for (int i = 1; i < n; i++) {
            a[i - 1] = a[i];
        }
		a[n-1]= temp;

		System.out.println( Arrays.toString(a));

	}
}