class Vehicle 
{

	String s1="engine";
}

class Car extends Vehicle
{
	int price =100000;

}

class Model extends Vehicle
{

	String name ="Fortuner";

}

class HeirarchicalInhertance
{
	public static void main(String [] args )
	{
		Vehicle v1=new Vehicle();
		System.out.println(v1.s1);
		//System.out.println(v1.name);
		//System.out.println(v1.price);

		Car c1= new Car();
		System.out.println(c1.price);
		System.out.println(c1.s1);
		//System.out.println(c1.name);
		
		Model m1= new Model();
		System.out.println(m1.name);
		//System.out.println(m1.price);
		System.out.println(m1.s1);
	}
}