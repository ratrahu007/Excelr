class  Sumofsquare {

	public static void main( String[] args ) 

	{
			int num = 555;
			int num1 = 123;
			int sum = 0;

			while(num>0)
			{
				int rem = num%10;
				sum = sum + rem*rem;
				num = num/10;
				


			}
			System.out.println(" The Number is " +  num1 + " and the sum of square is " + sum);

	}
}