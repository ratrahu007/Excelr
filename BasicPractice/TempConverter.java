class TempConverter
{

	static float kelvinOffset = 273.15f
;

	int celcius=15;

	float temp()
	{
		float temp = celcius-kelvinOffset;
		return temp;
	}
	public static void main( String [] args )
	{
	
		TempConverter t1= new TempConverter();
		
		System.out.println(t1.temp());

	}
}