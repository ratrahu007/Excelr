class EvenNumber extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
			{
				if(i%2==0)
				{
					System.out.println(i+ "    All even Numbers");
				}
			}
		try
		{
			
			Thread.sleep(5000);
		}
		catch( InterruptedException e)
		{
			
		}
	}
}

class Oddnumber implements Runnable
{
	public void run()
	{
		for(int i=0;i<=20;i++)
			{
				if(i%2 !=0)
				{
					System.out.println(i+ " all odd numbers");
				}
			}
		try
		{
			Thread.sleep(2000);			
			
			
		}
		catch(InterruptedException e)
		{
		}
	}
}
class EvenAndOdd
{
	public static void main( String [] args)throws InterruptedException
	{
		EvenNumber e1= new EvenNumber();

		Oddnumber o1 = new Oddnumber();

		Thread t1= new Thread(o1);

		e1.start();
		e1.join();
		t1.start();

		t1.join();
	}
}