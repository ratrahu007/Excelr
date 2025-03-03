

class ForRunnableInterface
{
	public static void main(String [] args)
	{
		Runnable t1=()->{
		for(int i=0;i<=10;i++)
		{
		System.out.println(i);
		}
		};
		Thread t2= new Thread(t1);
		t2.start();

	}
}