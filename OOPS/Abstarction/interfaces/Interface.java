import java.util.*;
interface PaymentMethod
{
	void processPayment(double amount);
	void displayPaymentMethod();
}
class CreditCard implements PaymentMethod
{
	
	
	public void processPayment( double amt)
	{
		
		System.out.println("Procees payment of .  " + amt + "  via Credit card....");
	}
	public void displayPaymentMethod()
	{
		System.out.println("Payment Method : Credit Card ");

	}
}
class DebitCard implements PaymentMethod
{
		public void processPayment( double amt)
	{
		
		System.out.println("Procees payment of .  " + amt + "  via Debit card....");
	}
	public void displayPaymentMethod()
	{
		System.out.println("Payment Method : Debit  Card ");

	}

}
class UPI implements PaymentMethod
{
	public void processPayment( double amt)
	{
		
		System.out.println("Procees payment of .  " + amt + "  via UPI ....");
	}
	public void displayPaymentMethod()
	{
		System.out.println("Payment Method : UPI ");

	}
}
class Interface
{
	public static void main( String [] args)
	{
		Scanner s1= new Scanner( System.in);
		
		System.out.println("Selsect Payment Method");
		System.out.println("1. Credit card");
		System.out.println("2. Debit  card");
		System.out.println("3. UPI card");
		
		System.out.println("Enter which method you want");

		int choice = s1.nextInt();

		System.out.println("enter a amount");

		double d1= s1.nextDouble();
	
		PaymentMethod payment = null;
		
		switch(choice)
		{
			case 1:
			payment = new CreditCard();
			break;
			
			case 2:
			payment = new DebitCard();
			break;

			case 3:
			payment = new UPI();
			break;
			
			default:
                System.out.println("Invalid choice! Please restart and enter a valid option.");
                s1.close();
                return;
			
		}
		payment.displayPaymentMethod();
		payment.processPayment(d1);
	}
}