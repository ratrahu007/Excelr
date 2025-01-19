class AppendInStringBuffer {

	public static void main( String [] args ) 

	{
		String s1 = "Virat";
		System.out.println(s1.hashCode());
		String s2 = s1.concat("Kohli");
		System.out.println(s2);
		System.out.println(s2.hashCode());


		System.out.println("============================================================");

		StringBuffer s3= new StringBuffer("Rohit");
		System.out.println(s3);
		System.out.println(s3.hashCode());

		StringBuffer s4= s3.append("Sharma");
		System.out.println(s4);
		System.out.println(s4.hashCode());

	}
}