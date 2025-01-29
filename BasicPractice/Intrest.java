class Intrest
{
	static float s1=5.1f;
	static float c1=4.0f;
	int time=1;
	float balance =2000.0f;
	static void show()
	{
		System.out.println("The intrest on saving account is   " + s1);
		System.out.println("The intrest on currentaccount is   " + c1);

	}
	float afterIntrest()
	{
		float totalbalSaving= balance*s1*time/100;
		float totalbalCurrent= balance*c1*time/100;
		
		return totalbalSaving;
		return totalbalCurrent;
	}
	public static void main(String [] args )
	{
		Intrest i1= new Intrest();
		System.out.println(i1.afterIntrest());

	}
}