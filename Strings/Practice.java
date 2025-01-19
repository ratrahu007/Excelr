class Practice {

	public static void main( String [] args )
	{

		// converting String into int 
		String s1= "121";
		String s2= "2";
		
		int a = Integer.parseInt(s1);
		int b= Integer.parseInt(s2);

		int res = a+b;
		System.out.println(res);

		// convert int into String
		int c= 10;
		int d=20;

		String s3= String.valueOf(c);
		String s4= String.valueOf(d);

		String res2= s3+s4;

		System.out.println(res2);

	}
}