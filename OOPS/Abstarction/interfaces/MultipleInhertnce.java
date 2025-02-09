interface Calling
{
		void makeCall( String number);
}
interface Message
{
	void sendMessage( String number, String message);


}
interface Browsing
{

	void BrowseIntrnet( String url);
}

class SmartPhone implements Calling, Message,Browsing
{
	public void makeCall(String number)
	{
		System.out.println("Calling To ..  "+ number);
	}
	public void sendMessage( String number, String message)
	{
		System.out.println("Sending message to    " + number + "     Message is :   "+ message);
	
	}
	public void BrowseIntrnet( String url)
	{
		System.out.println("You are surfing   :-  " + url);
	}
}
class MultipleInhertnce
{
	public static void main( String [] args)
	{
		SmartPhone myPhone= new SmartPhone();

		myPhone.makeCall("8010519221");
		myPhone.sendMessage("7020309650","Hey suraj how are you");
		myPhone.BrowseIntrnet("www.xnxx.com");

	}
}