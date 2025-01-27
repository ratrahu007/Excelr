class Vehicle {

	static String s1="engine";

}

class Car extends Vehicle
{

	int price=100000;
}

class Model extends Car
{
	 static String name="Toytoa";

}

class MultilevlInheritance
{
	public static void main( String [] args )
	{
		Vehicle v1= new Vehicle();
		Model m1= new Model();
		System.out.println(v1.s1);
		//System.out.println(v1.price);
		//System.out.println(v1.name);
		System.out.println(m1.s1);
		System.out.println(Model.name);
		System.out.println(Model.s1);	
	}
}