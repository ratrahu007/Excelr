class First 
{
	void m1()
	{
		System.out.println("welcome from Super class");

	}
}
class Second extends First
{
	void m1(int a)
	{
		System.out.println("welcome from Sub-class");
	}
}
class  OverLoadByInhertance
{
	public static void main(String [] args)
	{
		Second s1 = new Second();
		s1.m1(5);
		s1.m1();

	}
}