class AreaCalc
{
		void RectArea(int l, int w)
		{
			int area = l*w;
			System.out.println("the area of rect is " + area);
		}
		void AreaCircle(int r)
		{
			float pi= 3.14f;
			float area=pi*(r*r);
			System.out.println("The are of circle is "+ area);
		}
	public static void main( String [] args )
	{
	
		AreaCalc a1= new AreaCalc();
		a1.RectArea(5,6);
		a1.AreaCircle(4);
	}
}