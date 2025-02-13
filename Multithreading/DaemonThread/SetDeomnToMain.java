class SetDeomnToMain extends thread
{

	public static void main( String [] args )
	{
		System.out.println(Thread.currentThread().isDaemon());
		Thread.currentThread().setDaemon(true);==>IllegalThreadStateException
		System.out.println(Thread.currentThread().isDaemon());

		//This program give IllegalThreadStateException because We cannot create Daemon thread for main thread ,this programme not execute
	}
}