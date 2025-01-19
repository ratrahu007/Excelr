class Palinidrome {

	public static void main( String [] args )

	{
		String s1 = "mam";

		String s2 = "";

		for( int i=s1.length()-1; i>=0;i--)
		{
			char  res= s1.charAt(i);

			s2= s2+res;

		}
		if(s1.equals(s2))
			{
					System.out.println(" String is Palinidrome");

			}
		else
			{
					System.out.println("String is not Palinidrome");
			}
	}

}