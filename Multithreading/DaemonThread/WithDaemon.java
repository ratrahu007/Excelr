class DaemonWith extends Thread
{

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("daemon thread is runnig"+i);
			try{ Thread.sleep(500);} catch (InterruptedException e){}

		}
	}
}
class WithDaemon
{
	public static void main( String [] args)
	{
		DaemonWith d1= new DaemonWith();
		d1.setDaemon(true);
		d1.start();

		for(int i=1;i<=3;i++)
		{
			System.out.println("Main thread Runnig " + i);
			try{ Thread.sleep(1000);}  catch ( InterruptedException e) {} 
		}
			System.out.println( "Main Thread Finished");
	}
}