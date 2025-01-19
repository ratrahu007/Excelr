 class Armstrong {

	public static void main( String [] args ) 

	{
		int num = 153;

		int sum =0;

		int on =153;

		while( num>0 )

		{
			int rem = num%10;

			sum = sum + rem*rem*rem;

			num = num/10;

		}
			if( sum == on)  {
				System.out.println(" Number is Armstrong ");
			
		}

			else{
					System.out.println(" Not ArmStrong");

			}

	}
}