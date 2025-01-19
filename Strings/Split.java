class Split {

	public static void main( String [] args )
	{
		
		String s1 = "You%are%the%best";

		String []  res = s1.split("%");
		
		for( String part : res)
		{

			System.out.println(part);
		}

	}
}