class A
{
	String s1="Shankar";


}

class B extends A
{

	String s1="Rajamouli";
	void display()
	{
		System.out.println(s1);
		System.out.println(super.s1);
	}
}

class SuperForVariable
{

	public static void main( String [] args )
	{
		B b1= new B();
		b1.display();


	}
}