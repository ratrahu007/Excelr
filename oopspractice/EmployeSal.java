import java.util.Scanner;
class Employee
{
	void calculateSalary()
	{
	System.out.println(" Salary Structure of Employee");
	
	}
}
class  FullTimeEmp extends Employee
{
	
	void calculateSalary(int basesal)
	{
		int incentive= 4000;
		int totalsal= basesal+incentive;
		System.out.println(" total salary for full time emp is" + totalsal);
	}
}
class PartTimeEmp extends Employee
{
	void calculateSalary( float workhours)
	{
		int pay= 54;
		float totalsal2= workhours*54;
		System.out.println(totalsal2);
	}
}
class EmployeSal
{

	public static void main( String [] args )
	{
		Scanner s1= new Scanner(System.in);

		System.out.println("Enter a full time sal");
		int fullsal= s1.nextInt();

		System.out.println("Enter a part-time time sal");
		float partsal= s1.nextFloat();
		
	
		PartTimeEmp e1= new PartTimeEmp();
		
	
		e1.calculateSalary();
	
		e1.calculateSalary(fullsal);

		e1.calculateSalary(partsal);

	}
}