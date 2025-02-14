class TryCatchexample
{
	public static void main( String [] args)
	{
		
		try
		{
			int a =5;
			int b=0;

		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("We can't divide any number by 0");

		}

	}
}