class SetDemonForchild extends Thread
{
	public void run()
	{
		System.out.println("Child Thread");
		System.out.println(Thread.currentThread().isDaemon());
	}
	
	public static void main( String [] args)
	{
		SetDemonForchild s1= new SetDemonForchild();
		s1.setDaemon(true);
	
		s1.start();
		System.out.println("Main Thread");	

	}
}