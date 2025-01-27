class  ByClassName
{

	static  int a = 200;
	
	void show()
	{

		int a=100;
		System.out.println(a);
		System.out.println(ByClassName.a);

	}
	public static void main( String [] args)
	{
		ByClassName t1 = new ByClassName();
		t1.show();

	}
}