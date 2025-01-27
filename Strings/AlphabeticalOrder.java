class AlphabeticalOrder{

	public static void main( String [] args )
	{
		String s1= "baz";

		for(int i=0; i<s1.length();i++)
		{
			char res = s1.charAt(i);

			int alpha = res -96;
			System.out.println(alpha);
		}
		
	}
}