class Palinidrome {

	public static void main( String [] args ) 

		{
			int num = 161
			
			int rev  =0;
			
			int on =121;

			while(num>0)

			{

				int rem = num%10;

				rev = rev*10 + rem;
				
				num = num/10;
			}
				if( on == rev ) 

				{

						System.out.println( " Number is Palinidrom ");
				
				}

			else 

			{

						System.out.println( " Number is Not Palinidrome");

			}

		}
}