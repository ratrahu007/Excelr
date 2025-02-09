class Payment 
{

	void processpayment()
	{		
		System.out.println("Payment is processing");
	}
}
class CreditCardPayment extends Payment
{
	
	void processpayment()
	{		
		System.out.println(" Credit Card Payment is processing");
	}

}
class UPIPayment extends Payment
{

void processpayment()
	{		
		System.out.println(" Upi Payment is processing");
	}

}
class Payments extends Payment
{

	public static void main( String [] args )
	{
	Payment[] payments = new Payment[2];
        payments[0] = new CreditCardPayment();
        payments[1] = new UPIPayment();

        // Loop through the array and call processPayment() dynamically
        for (Payment p : payments) {
            p.processpayment();
		
	}

	}
}
