interface A
{
	public static final a=5;
	
	public abstract void m1();

}
interface B implements A
{
	void m1()
	{
		System.out.println(" m1 in B");

	}
}
class Interfaces
{
	public static void main( String [] args )
	{
		A a1= new B();

		a1.m1();


	}
}