class Emp
{
	Emp()
	{
		this(7);
		System.out.println("HCL");
	}
	Emp(int x)
	{
		this();
		System.out.println("Wipro");
	}
}
class Chaning extends Emp
{
	Chaning()
	{
		this(7);
		System.out.println("Infosys");
	}
	Chaning(int x)
	{
		super();
		System.out.println("zohO");
	}
	public static void main( String [] args )
	{

		Chaning c1 = new Chaning();

	}
}