class  First
{
	void m1(int a)
	{
		System.out.println("hello from first class");
	}
}

class Second
{
	void m1()
	{
		System.out.println("hello from Second class");
	}
}
class OverloadingInMthan1Class
{
	public static void main( String [] args )
	{
		Second f1= new  Second();
		f1.m1();
	}
}