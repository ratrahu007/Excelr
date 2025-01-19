class ArrayPractice {

	public static void main( String [] args ) 
	{

		int [] arr = new int[4];
		
		arr[0] = 121;
		arr[1] = 131;
		arr[3] = 141;

		int  len = arr.length;
		
		for( int i=0; i<len-1;i++)
		{

			System.out.println(arr[i]);

		}			
		



	}

}