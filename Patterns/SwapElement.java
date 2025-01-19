import java.util.*;

class  SwapElement {

	public static void main( String [] args ) 

	{

		int [] a={ 1,2,3,4,8,9};

		int temp;
		System.out.println( " the Swaped array  before' " + Arrays.toString(a));
		
		temp = a[0];
		 a[0]= a[a.length-1];
		a[a.length-1]= temp;

		System.out.println( " the Swaped array is " + Arrays.toString(a));
		



	}
}