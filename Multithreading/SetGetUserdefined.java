class SetGetUserdefined extends Thread
{
	public void run()
	{

	}
	public static void main( String [] args )
	{
		System.out.println(Thread.currentThread().getName());//main
		Thread.currentThread().setName("Main - Thread ");
		
		SetGetUserdefined s1= new SetGetUserdefined();
		System.out.println("==============================");
		System.out.println(s1.getName());
		
		s1.setName("Rajkumar");
		
		System.out.println(s1.getName());
	}
}