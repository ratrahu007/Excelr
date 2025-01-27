import java.util.*;

class EvenOdd {

	
	 int   Evenodd(int a)
	{
		if(a%2==0)
		{
			return  1;
		}
		else
		{

			return 1;
		}
	}
	public static void main( String [] args )
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter a Number");
	
		int num = s1.nextInt();

		EvenOdd e1= new EvenOdd();
		//e1.Evenodd(num);
		 int  res =e1.Evenodd(num);
		new EvenOdd();
		System.out.println(res);
	}
}