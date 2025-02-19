import java.util.*;
class ArthemeticExceptionEg
{
public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	try
	{
		System.out.println("Enter a first number");
		int a=sc.nextInt();
		System.out.println("Enter a second number");
		int b= sc.nextInt();

		int c= a/b;
		System.out.println("The division is   "+c); 
	}
	catch(ArithmeticException e)
	{
		System.out.println("you cant divide any number by 0");
	}

}
}