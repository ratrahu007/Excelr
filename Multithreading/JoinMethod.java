class JoinMethod extends Thread
{
	public void run()
	{
		for( int i=0;i<=10;i++)
		{
			try
			{
				System.out.println("E-KYC");
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
			}	
		}	
	}

public static void main( String [] args )throws InterruptedException
{

	JoinMethod j1= new JoinMethod();

	j1.start();
	j1.join();
	for(int i=0;i<=10;i++)
	{
		System.out.println("Rahul Thread");
	}
}
}