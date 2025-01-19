import java.util.Arrays;

 class SearchByIndex {

	public static void main ( String [] args ) 

	{
		String [] arr1= { " vidya " , " Yogita" , " Goutami" , " Shweta" };

		Arrays.sort(arr1);

		System.out.println(" the index of that elemnt is " + Arrays.binarySearch(arr1, "Shweta"));




	}

}