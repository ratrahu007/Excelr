class RevNumber {
public static void main ( String [] args ) 

{

		int num =5678;
		int rev= 0;
		int on = 8765;
		

		while( num>0)
		{
		 	int rem = num %10;
			rev = rev*10 + rem;
			num = num/10;

		}
		System.out.println(rev == on);
		System.out.println(rev);




}
}