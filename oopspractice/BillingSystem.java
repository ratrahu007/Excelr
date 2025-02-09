import java.util.*;
class BillingSystem
{
	
	void amount(int amt)
	{
		System.out.println(" You purchase the goods of " + amt);

	}
	void amount(int amt, float discount)
	{
		float alldisc= (discount/100)*amt;

		float final1= amt- alldisc;

		System.out.println(" You Saved The" + final1);

	}
	void amount (int amt, float discount,float tax)
	{
		float alltax= (discount/100)*amt;

		float finaltax= amt+alltax;

		System.out.println("you bill is after gst is :" + finaltax);

	}

	public static void main(String [] args )
	{
		Scanner s1= new Scanner(System.in);
	
		System.out.println("Enter a price");
		int price = s1.nextInt();

		System.out.println("Enter a discount ");
		float disc =s1.nextFloat();

		System.out.println("Enter the Tax");
		float taxes =s1.nextFloat();

		BillingSystem b1= new BillingSystem();
		b1.amount(price);

		
		BillingSystem b2= new BillingSystem();
		b2.amount(price,disc);

		
		BillingSystem b3= new BillingSystem();
		b3.amount(price,disc,taxes);

	}
}