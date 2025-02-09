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
	void sendSms()
	{
		System.out.println("Sending sms from JIO");
	}
}
class Airtel extends Realme
{
	void sendSms()
	{
		System.out.println("Sending sms from airtel");
		
	}
}
class Abstraction
{

	public static void main( String [] args )
	{
		Realme r1= new Airtel();
			
       		r1.playyoutube();
		r1.sendSms();
	

	}
}