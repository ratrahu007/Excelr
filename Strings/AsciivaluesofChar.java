class AsciivaluesofChar {

	public static void main( String [] args )
	{
			String s1 = "AbCd";

			for(int i=0; i<s1.length();i++)
			{
				char res = s1.charAt(i);
				
				int ascii = (int) res;
					System.out.println(" The char is  "  +    res   + "   ascii value of that char is "   + ascii);
			}
		

	}
}