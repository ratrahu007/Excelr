class  RahulThread extends Thread
{
	int sum =0;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("child thread got 2nd chance");
			
			for(int i=0;i<=100;i++)
			{
				sum= sum+i;

			}
			System.out.println("Perfromed all logic and giving upt to main");
			this.notify();
		}
	}
}
class AllMethods
{
	public static void main ( String [] args )throws Exception
	{
		RahulThread t1 = new RahulThread();
		t1.start();

		synchronized(t1)
		{
			System.out.println("main got chance 1st chance and waiting");
			t1.wait();
			System.out.println("main got updation");
			System.out.println(t1.sum);
		}
	}
}