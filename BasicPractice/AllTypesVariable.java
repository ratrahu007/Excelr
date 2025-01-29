class AllTypesVariable
{
	int instanceVar = 9;//instance variable
	
	static int staticVar=10; //static variable

	void m1()
	{
		int a=5;//local variable

		System.out.println(a);
	}
	public static void main(String [] args )
	{

		AllTypesVariable a1= new AllTypesVariable();
		System.out.println("The Instance variable can be acces by Object or Object refernce"+a1.instanceVar);

		System.out.println("static variable can be acces by classname or directly" + AllTypesVariable.staticVar);

		 a1.m1();




	}
}