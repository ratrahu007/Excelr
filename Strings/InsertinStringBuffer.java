class InsertinStringBuffer{

	public static void main( String[] args ) 
	{

		StringBuffer s1= new StringBuffer("Jalgaon");

		System.out.println(s1);

		StringBuffer res = s1.insert(3,'d');

		System.out.println(res);

	}

}