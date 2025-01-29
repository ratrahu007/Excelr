class First
{
	void m1()
	{
		System.out.println("Hii from super class");
	}
}
class Second extends First
{
	void m1()
	{
		System.out.println("Hii from the sub class");
	}
}
class Overrding
{
	public static void main( String [] args )
	{
		Second s1= new Second();
		s1.m1();
		
	}
}