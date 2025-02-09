class Vehicle
{
	String s1="engine";
}
class Car extends Vehicle
{
	int ctyre=1000;
}
class Downcast
{
	public static void main( String [] args )
	{
		Vehicle v1= new Car();
		Car c1= (Car)v1;
		System.out.println(c1.s1);
		System.out.println(c1.ctyre);
		// if we perform downcasting we can access the both super  class and sub-class feature at a time...

	}
}