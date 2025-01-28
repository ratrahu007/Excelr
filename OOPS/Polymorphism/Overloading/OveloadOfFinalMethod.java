class OveloadOfFinalMethod
{
	final void m1()
	{
		System.out.println("Hello From the Final method");

	}
	static void m1(int a)
	{
		System.out.println("hello from the static method");
	}
	public static void main(String [] args)
	{
		OveloadOfFinalMethod o1 = new OveloadOfFinalMethod();
		o1.m1();
	}
}