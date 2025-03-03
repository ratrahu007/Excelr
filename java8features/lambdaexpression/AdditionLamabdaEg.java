interface A
{
	public void  add(int a, int b);

}
class AdditionLamabdaEg
{

	public static void main(String [] args)
	{
			A  a1=(a,b)->System.out.println(a+b);	
			a1.add(5,10);	

	}
}