class Vehicle
{

	String s1= "Engine";

}
class Car extends Vehicle
{

	int ctyre=1000;

}
class Nexon extends Car
{

	int cprice = 100000;

}
class Upcast1
{
	public static void main( String [] args )
	{
		Vehicle v1= new Car();
		System.out.println(v1.s1);

		Car v2=new Nexon();
		System.out.println(v2.ctyre);


	}
}