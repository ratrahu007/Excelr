class ConvertUpperToLower {

	public static void main( String [] args )

	{
		String s1="BhA";
		String s2=" ";
			
		for( int i=0;i<s1.length();i++)
		{
			char res = s1.charAt(i);

			if(res >= 'A' && res <= 'Z')
			{
				s2= s2 + (char) (res+32);
			}
			else{

				s2=s2+res;
				}
		}

		System.out.println(" The Lowercase String is      "+   s2);

	}


}