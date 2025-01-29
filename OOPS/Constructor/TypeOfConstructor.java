class TypeOfConstructor
{
	int a;
	TypeOfConstructor()
	{
		System.out.println("Hello from the Default constructor");

	}
	TypeOfConstructor(int a)
	{
		this.a=a;
		System.out.println("Hello from the Parameterized constructor");	
	}
	TypeOfConstructor(TypeOfConstructor ref)
	{
		this.a= ref.a;
		System.out.println("Hello from the Copyconstructor");
		System.out.println(this.a);
	}
	public static void main( String [] args )
	{

		TypeOfConstructor t1= new TypeOfConstructor();
		
		TypeOfConstructor t2= new TypeOfConstructor(9);	
		
		TypeOfConstructor t3= new TypeOfConstructor(t2);




	}
}