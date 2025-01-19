class  HaughDiamond {

 	public static void main( String [] args ) 

	{

		for( int i=1; i<=5;i++)
		{
			for(int j=i ; j<=5;j++)
			{
				System.out.print(" ");


			}
			
			for( int k=1; k<=i ; k++)
			{

				System.out.print("*");

			}

				System.out.println();
		}
	
		// for other haugh
		
		for( int x=1; x<=5; x++)
			{
				for( int y=1; y<=x;y++)
					{
						System.out.print(" ");
					}
				
					for( int z=x;z<=5;z++)

					{
						System.out.print("*");
					}

					System.out.println();
			
			}


	}

}