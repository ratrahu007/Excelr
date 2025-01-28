class ChangeInorder
{
	void m1( String a, int b)
	{
		System.out.println("Hello from first");

	}
	void m1(int b, String a)
	{
		System.out.println("Hello from Second");
	}
	public static void main( String [] args )
	{
		ChangeInorder c1= new ChangeInorder();
		c1.m1(4,"golu");

	}
}