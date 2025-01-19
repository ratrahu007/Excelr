class CountPalindromeInArray {

	public static void main( String[] args ) 

		{
				int count =0;
			int [] a = { 1, 11, 55, 97,121}; // array initialization
			
			for( int i=0; i<a.length;i++){

				int original = a[i];
				int rev=0;
				
				int num = a[i];
				
				while(num>0 )

				{
					int rem =  num%10;

					rev = rev*10+rem;
					
					num = num/10;
					
				}	

				if( original == rev)
				{
					count++;
					System.out.println(original);
				}

		}
		System.out.println(" Toatal number of palinidrome in array is " + count);
}
}