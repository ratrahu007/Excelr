class EvenOfarray {

	public static void main( String [] args )

	{

		int [] a = {1,2,5,8,6,4,24,50};
		int count =0;
		for(int i=0; i<a.length;i++)
		{

			if(a[i] % 2==0)
				{

					count++;


				}
			
		}

		System.out.println( count);
	}
}