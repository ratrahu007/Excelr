class Vehicle 
{
	String s1 ="engine";	
}
class Car extends Vehicle
{
	int ctyre= 100;
}
class Upcast
{

	public static void main( String [] args )
	{
		Vehicle v1 = new Car();
		System.out.println(v1.s1);
		
		//System.out.println(v1.ctyre); "Invalid because we assigned object of car class to Vehicle super class it only acces super class feature


	}
}