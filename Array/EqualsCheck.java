import java.util.Arrays; 
class EqaulsCheck {

	public static void main ( String [] args ) 
	
	{

		int [] arr1 = { 10,20,30};
		int [] arr2= { 10,20,30 } ;
		int [] arr3 = {20,30,40 };
		
		System.out.println( " Arr1 and Arr 2 are Eqaul ::  " + Arrays.equals(arr1,arr2));
		System.out.println( " Arr1 and Arr 2 are Eqaul ::  " + Arrays.equals(arr1,arr3));
		System.out.println( " Arr1 and Arr 2 are Eqaul ::  " + Arrays.equals(arr3,arr2));



	}


}