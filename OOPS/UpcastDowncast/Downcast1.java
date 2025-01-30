class Vehicle
{
	String s1 = "Engine";

}
class Car extends Vehicle
{

	int ctyre = 100;
}
class Nexon extends Car
{

int cprice = 10000;
}
class Downcast2
{
	public static void main( String [] args )
	{
		Vehicle v1=new Car();
		Car c1=(Car) v1;
		System.out.println(v1.s1);
		System.out.println(c1.s1);
		System.out.println(c1.ctyre);	
	}
}