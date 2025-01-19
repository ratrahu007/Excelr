 class CountEven{

	public static void main( String [] args )

	{
		int [] a={1,2,3};
		int count =0;
		for( int i=0;i<=a.length-1;i++)
		
		{
			if( a[i] %2==0)
				{
					count = count+1;
				}


		}

		System.out.println(count);
	}
}