import java.util.*;
class IllegalAgeException extends Exception
{
	IllegalAgeException(String msg)
	{
		super(msg);
	}
}
class ThrowManually
{

	public static void main( String [] args)throws  IllegalAgeException
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age");
		
		int age=sc.nextInt();
		if(age>18)
		{
				System.out.println("Eligible for Vote");
		}
		else
		{
				throw new IllegalAgeException("Not Eligible for Vote");
		}

	}
}