class BychangeInParameter
{
	void m1(int a , int b)
	{
		System.out.println("Welcome");
	}
	void m1(int a , int b , int c)
	{
		System.out.println("Bye");
	}
	public static void main( String [] args )
	{
		BychangeInParameter o1= new BychangeInParameter();
		o1.m1(5,6);
	}
}