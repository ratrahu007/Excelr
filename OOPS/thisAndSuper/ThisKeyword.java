class ThisKeyword
{
	String s1="Mahesh";
	void display()
	{
		String s1="pawan";
		System.out.println(s1);
		System.out.println(this.s1);

	}
	public static void main( String [] args)
	{
		ThisKeyword t1= new ThisKeyword();
		t1.display();
		System.out.println(t1.s1);
	}
}