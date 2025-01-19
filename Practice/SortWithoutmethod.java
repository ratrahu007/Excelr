import java.util.Arrays;
class SortWithoutmethod {

	public static void main( String [] args )
		
	{
		
		int [] a = {1,4,3,2,7,9,5};
		
		for( int i=0; i<a.length;i++)
		{
			for( int j= i+1;j<a.length;j++)
			{
				if(a[i] > a[j] )
				{
					int temp;
					temp = a[i];
					a[i]    = a[j];

					a[j]    =temp;
					

				}
			
			}
		}
			System.out.println(Arrays.toString(a));
	}
}