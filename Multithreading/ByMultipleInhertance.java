interface I1
{


}
class ByMultipleInhertance implements Runnable,I1
{
	public void run()
	{
		System.out.println("Userdefined Thread with Multiple Inhertance");

	}
	public static void main( String [] args )
	{
		 ByMultipleInhertance  b1= new  ByMultipleInhertance ();

		Thread t1= new Thread(b1);

		t1.start();


	}
}