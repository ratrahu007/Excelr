@FunctionalInterface
interface A
{
	public void m1();

}
class LamabdaEg
{

	public static void main(String [] args)
	{
			A  a1=()->System.out.println("Hello World Using lambada Exppression");	
			a1.m1();	

	}
}
/*
We can't use a standalone lambda expression in java like other languges 
/Lambda expression is used to implements the funxctional interface..



*/