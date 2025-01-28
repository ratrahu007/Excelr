import java.util.*;
class SimpleCalci
{
	public static void main(String [] args )
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a 1st Number");
		int a =sc.nextInt();

		System.out.println("Enter a 2nd Number");
		int b =sc.nextInt();

		System.out.println("The addition is "  + (a+b));
		System.out.println("The substraction  is "  + (a-b));
		System.out.println("The Multiplication  is "  + (a*b));
		System.out.println("The division  is "  + (a/b));

	}
}