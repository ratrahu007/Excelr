class ReverseaString{

	public static void main( String [] args ) 
	{
		String s1 = "Rahul";

		String s2 = " ";

		for( int i=s1.length()-1; i>=0;i--)
		{
			char  res= s1.charAt(i);

			s2= s2+res;

		}
		System.out.println(s2);
	}
}