class CountVowelsandConsonants {

	public static void main( String [] args )
	{

		String s1 = "RahulRathod";

		int count =0;

		int count1=0;

		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(  (ch == 'a') || (ch == 'e') ||( ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U') )
			{
					count++;

			}
			else
			{
					count1++;

			}

		}
		System.out.println("the count of vowels are " + count);
		System.out.println("the count of consonants  are " + count1);
	}

}