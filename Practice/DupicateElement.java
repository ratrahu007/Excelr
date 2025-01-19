class DupicateElement {

	public static void main( String [] args )
	{

		int [] a= { 1,2,3,5,6,9,1,2,3,5};

		for( int i=0; i<a.length;i++)
		{
			for( int j=i+1;j<a.length;j++)
			{
				if( a[i] == a[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}
}