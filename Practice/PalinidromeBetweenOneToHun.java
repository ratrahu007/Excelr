class    PalinidromeBetweenOneToHundred {

	public static void main(  String [] args ) 

		[
			int count =0;
			
			int rev;
			for( int i=1 ; i<=100;i++)
				
				{

					for( int j=i; j<=i;j++)
					{
						int rem = j%10;

						rev =  rev*10 + rem;
							

							count++;

						 j = j/10;
						


					}
					
					
				}
					System.out.println( count);

		}
}