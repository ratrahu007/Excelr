import java.util.Arrays;
class BinarySearch {

	public static void main( String [] args ) 

	{

	
	  int []arr1 = { 2,4,6,8};
	Arrays.sort(arr1);
	
	int numfor = Arrays.binarySearch( arr1,8);
	System.out.println(" the number is found bro " + numfor );

   	int wrongnum = Arrays.binarySearch( arr1,7);
	System.out.println(" The number is " + wrongnum);



	}

}