class MinimumInArray {

	public static void main( String [] args )
	{
		int [] a= { 2,5,1,8,6};

		int min;

		min = a[0];

		for( int i=0;i<a.length;i++)
		{
			if(a[i] < min )
			{

				min = a[i];

			}

		}
			System.out.println( min);
	}
}