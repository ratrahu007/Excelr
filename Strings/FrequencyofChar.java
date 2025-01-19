class FrequencyofChar {

	public static void main( String [] args )

	{
		String s1 = "abbacbdedd";
	
		
		for( char ch = 'a' ; ch <='z' ; ch++)
			
			{
				int count =0;
				for( int i=0; i<s1.length();i++)
				{
					char res = s1.charAt(i);

					if(ch==res)
					{
						count++;
					}

				}
				if(count>1)
				{
				System.out.println(" The char is  "  +ch  + " and frequency is "  + count);

				}
			}

	
	}
}