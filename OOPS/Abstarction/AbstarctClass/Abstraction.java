 abstract class Realme
{
	void playyoutube()
	{
	
		System.out.println("Playing Yotube in realme");
	}
	  abstract void sendSms();

}
class Jio extends Realme
{
	Jio()
	{
		System.out.println("Jio sim is enable to device ");

	}
	void sendSms()
	{
		System.out.println("Sending sms from JIO");
	}
}
class Airtel extends Realme
{
	Airtel()
	{
		System.out.println("Airtel sim is enable to device");

	}	
	void sendSms()
	{
		System.out.println("Sending sms from airtel");
		
	}
}
class Abstraction
{

	public static void main( String [] args )
	{
		Realme r1= new Jio();
			
       		r1.playyoutube();
		r1.sendSms();
	

	}
}