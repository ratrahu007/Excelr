class FinalModifier
{
	 final int a=6;
	
	void m1()
	{
		//a=7;
		System.out.println(a);
	}
	public static void main( String [] args)
	{
		FinalModifier f1= new FinalModifier();
		f1.m1();	

	}
}