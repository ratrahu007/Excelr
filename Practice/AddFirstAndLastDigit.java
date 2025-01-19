class  AddFirstAndLastDigit {

	public static void main( String[] args ) 

	{
		int num = 1234;

		int lastdigit = num%10;

		int firstdigit = num;
		
		while(  firstdigit >=10)
		{
			firstdigit= firstdigit/10;

		}

		int sum = firstdigit + lastdigit;

		System.out.println( " The First Digit is " + firstdigit + " The LastDigit is " + lastdigit + " And the sum of those is " + sum);




	}
}