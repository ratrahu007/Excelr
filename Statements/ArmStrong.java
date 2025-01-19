class  ArmStrong {
 
public static void main( String[] args )

{

		int num =66;
		int on =66;
		int sum = 0;
		
		while(num>0)
		{
			int rem = num%10;
			sum = sum+rem*rem*rem;
			num = num/10;
		}
		
		if(sum == on ) 
		{
			System.out.println(" is ArmStrong ");
		}
		 
		else

		{
			System.out.println("not Armstrong");
		}		



}
}