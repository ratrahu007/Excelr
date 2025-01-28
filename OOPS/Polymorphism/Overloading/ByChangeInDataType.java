class ByChangeInDataType

{
	void m1( int a , float b)
	{
		System.out.println("welcome from first");
	}
	void m1(float a, int b)
	{
		System.out.println("welcome from second");
	}
	public static void main( String [] args )
	{
		
	ByChangeInDataType  d1= new ByChangeInDataType();
	d1.m1(5.0f,2);	

	}
}