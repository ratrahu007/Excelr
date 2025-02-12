class ByRunnableInterface implements Runnable 
{
	public void run()
	{
		System.out.println("UserDefinedThread");
	}
	public static void main( String [] args )
	{
		ByRunnableInterface b1= new ByRunnableInterface();

		Thread t1= new Thread(b1);

		t1.start();
	}
}