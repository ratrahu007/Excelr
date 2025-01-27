class WhySuper 
{
	void show()
	{
		display();
		System.out.println("Bye from Show");


	}
	void display()
	{
		System.out.println("Hello from display");

	}
	public static void main(String [] args)
	{
		WhySuper t1 = new WhySuper();
		t1.show();
	}
}