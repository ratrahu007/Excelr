class DeleteInStringBuffer {

	public static void main( String [] args)
	{
		StringBuffer s1= new StringBuffer("Rahulbastardhai");

		StringBuffer s2= s1.delete(5,13);

		System.out.println(s2);


	}
}