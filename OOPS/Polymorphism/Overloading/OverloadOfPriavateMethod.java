class OverloadOfPriavateMethod
{
	void m1()
	{
		System.out.println("Hello from normal method");

	}
	private void m1(int a)
	{
		System.out.println("Hello from the private method ");
	}
	public static void main( String [] args)
	{
		OverloadOfPriavateMethod o1= new OverloadOfPriavateMethod();
		o1.m1(5);
	}	
}