import java.util.*;
class TakeInputs 
{
	public static void main(String [] args )
	{

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name =sc.nextLine();

		System.out.println("Enter your age");
		int age =sc.nextInt();

		System.out.println("Enter your Gpa");
		double gpa =sc.nextDouble();

		System.out.println("Enter your Gender");
		char gender =sc.next().charAt(0);

		System.out.println("Your Name :  "   + name);	
		System.out.println("Your Age:  "   + age);	
		System.out.println("Your GPA :  "   + gpa);	
		System.out.println("Your Gender :  "   +gender)	;
	}
}