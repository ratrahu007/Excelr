class PerfectNumInArray {

	public static void main( String [] args ) 

	{

		int [] a= {2,5,6,7,9};

	
		int count =0;

		for( int i=0;i< a.length;i++)
		{
				int sum =0;
			int num = a[i];
			
			for( int j=1;j<num;j++)
				{
					if( num%j==0)
					{

						sum= sum+j;
					

						
					}

				}
				if(sum == num)
			{
				System.out.println(    num  +  " Number is Perfect");
				
			}
				else{

						System.out.println(   num  +" Not Perfect");
					}
		}

	}

}