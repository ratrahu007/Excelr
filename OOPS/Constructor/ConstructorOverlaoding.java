class ConstructorOverlaoding
{

	ConstructorOverlaoding()
	{
		System.out.println("i could present every time");

	}
	ConstructorOverlaoding(int a)
	{
		System.out.println("ovelaoding ingnit");

	}
	ConstructorOverlaoding(int b, float a)
	{
		System.out.println("Differ in datatype");
	}
	ConstructorOverlaoding(float a, int b)
	{
		System.out.println("Differ in order");
	}
	ConstructorOverlaoding(String s1, double d)
	{
		System.out.println("always different ");
	}	
	public static void main( String [] args)
	{
		ConstructorOverlaoding c1= new ConstructorOverlaoding();

		ConstructorOverlaoding c2= new ConstructorOverlaoding(5);

		ConstructorOverlaoding c3= new ConstructorOverlaoding(2, 1.5f);

		ConstructorOverlaoding c4= new ConstructorOverlaoding(1.2f,1);

		ConstructorOverlaoding c5= new ConstructorOverlaoding("yogita",2.0d);
	
		
	}
}