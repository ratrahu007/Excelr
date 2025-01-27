class Vehicle {

	
	String s1 ="Engine";


}

class Car extends Vehicle 
{
	int price = 100000;

}

class SingleInhertance {

	public static void main( String [] args )
	{
		Vehicle v1= new Vehicle();
		System.out.println(v1.s1);

		Car c1= new Car();
		System.out.println(c1.price);
		System.out.println(c1.s1);

		//System.out.println(v1.price);

	}
}
