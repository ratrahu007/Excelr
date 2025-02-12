class DemoThread extends Thread
{
	public void run ()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("UserdefinedThread");

		}
	}

public static void main( String [] args)
{
	DemoThread d1= new DemoThread();
	d1.start();

	for(int i=0;i<=10;i++)
	{
		System.out.println("Mainthread");

	}
}
}