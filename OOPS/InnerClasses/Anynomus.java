interface A
{
	void m1();
}
class Anynomus 
{
	public static void main( String [] args )
	{
		A a1= new A()
		{
			public void m1()
			{	
			System.out.println("m1 in anynoums class");
			}	
		};
		a1.m1();
	}
}