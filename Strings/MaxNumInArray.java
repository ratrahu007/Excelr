class MaxNumInArray {

	public static void main( String [] args )
	
	{
		int [] a= { 1,7,4,5,109};

		int max;

		max = a[0];

		for( i=0; i<a.length;i++)

		{
			if(a[i] > max)
			{
				max = a[i];

			}			
		}
		System.out.println(max);
	}

}