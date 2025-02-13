class Mythread extends Thread
{

	public void run()
	{
		for(int i=0;i<=5;i++)
		{		
			System.out.println("User Thread Runnig "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
class withoutDaemon
{
	public  static void main( String [] args )
	{
		Mythread m1= new Mythread();
		m1.start();
		
		for( int i=1;i<=3;i++)
		{
			System.out.println("Main thread Executing"+i);

		try{Thread.sleep(1000);} catch (InterruptedException e){}
		}
		System.out.println("Main Thread finished ");
	}
}
/*
User thread running: 1
Main thread executing: 1
User thread running: 2
Main thread executing: 2
User thread running: 3
Main thread executing: 3
Main thread finished.
User thread running: 4
User thread running: 5
=========================
✅ The user thread continues running even after the main thread finishes.
Overcome to this one we use Daemon thread
*/