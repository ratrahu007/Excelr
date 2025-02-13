class RahulThread extends Thread
{
	int sum=0;
	public void run()
	{
		
			
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
/*
Your code has a compilation error because the variable sum inside the run() method is local to the method and cannot be accessed outside of it in main().



*/