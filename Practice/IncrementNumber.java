class IncrementNumber {

	public static void main( String [] args ) 

	{
			int num=1;
		 // Loop for each row
        for (int i = 1; i <= 5; i++) {
            // Loop for numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
		num++;
            }
            System.out.println(); // Move to the next line
        }









	}

}