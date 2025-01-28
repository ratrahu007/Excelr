class OveloadofStaticMethod
{
	
	void m1(int a)
	{
		System.out.println("Hello from the instance method");


	}
	static void m1(int a, int c)
	{
		System.out.println("Hello from the static method");
	}
	public static void main( String [] args)
	{
		OveloadofStaticMethod.m1(5,9);

	}
}