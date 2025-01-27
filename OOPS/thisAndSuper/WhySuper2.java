class  A
{

	void display()
	{
		System.out.println("welcome from display super class");

	}
}
	class B extends A
	{
		void display()
		{
			System.out.println("welcome from display sub-class");
			super.display();
		}
	}

class  WhySuper2{
	public static void main( String [] args )
	{
		B b1= new B();
		b1.display();

	}
}
