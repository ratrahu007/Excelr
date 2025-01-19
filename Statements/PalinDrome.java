class PalinDrome {

public static void main( String  [] args ) 
{
  		int num =121;
		int rev=0;
		int on = 121;
		
		while(num>0)
		{
			int rem = num%10;
			rev = rev*10+ rem;
			num= num/10;
		}
		
		if(rev == on )
		{
			System.out.println(" Number is Palindrome ");

		}

		else
		{
			System.out.println("Number is not palinidrome");
		}


}
}	

