class ConutAplhaSymbolandDigit{

	public static void main( String [] args )
	{
			String s1 = "Rutik@2002";
			int count =0;
			int count1 =0;
			int count2 =0;

			for( int i=0;i<s1.length();i++)
			{
				char res = s1.charAt(i);

				if( (res > 'a' && res <'z') || (res >'A' && res < 'Z') )
				{
					count++;
				}

				else if( res >= '0' && res <='9')
				{
					count1++;

				}
				else{
						count2++;
					
					}
			}
			System.out.println("the count of alphabates is " + count);
			System.out.println("the count of Digits  is " + count1);
			System.out.println("the count of Symbols  is " + count2);

	}
}