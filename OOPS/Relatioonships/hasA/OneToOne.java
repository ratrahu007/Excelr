class Addr
{
	int flatNo;
	String road;
	Addr(int flatNo,String road)
	{
		this.flatNo= flatNo;
		this.road= road;
	}
}
class Emp 
{
	String ename;
	int age;
	Addr a1;
	 Emp(String ename, int age, Addr a1)
	{
		this.ename=ename;
		this.age=age;
		this.a1=a1;
	}
	void displayDetails()
	{
		System.out.println(ename);
		System.out.println(age);
		System.out.println(a1.flatNo);
		System.out.println(a1.road);

	}
}
class OneToOne
{
	public static void main( String [] args)
	{
		Addr a1= new Addr( 21,"Vasundhara");

		Emp e1=new Emp("subhash",28,a1);
		e1.displayDetails();
	}
}