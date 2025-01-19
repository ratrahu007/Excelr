import java.util.Arrays;

class CopyRange {

 public static void main ( String [] args ) 

	{
		int [] arr1= { 1,2,3,4,5,6,7,8,9,10,11,12};
		int [] copyarray = Arrays.copyOfRange(arr1,3,7);
		
		System.out.println( " The new array is "  + Arrays.toString(copyarray));


	}

}