class RahulThread extends Thread
{
	public void run()
	{
		
			int sum=0;
			for(int i=1;i<=100;i++)
			{
				sum=sum+i;
			}
			
	}
}
class Demo
{
	public static void main(String[] args)throws Exception
	{
		RahulThread a1=new RahulThread();
		a1.start();
		System.out.println(a1.sum);
			
			
	}
}
