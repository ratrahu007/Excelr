import java.util.Arrays;
class UniqueElement {

	public static void main( String[] args ) 

	{
		int [] a= { 1,2,3,1,2};
		for( int i=0; i<a.length;i++)
		{
			for( int j= i+1; j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					a[j] =0;

				}
				
			}
		
		}
		for(int k= 0 ; k<a.length;k++)
		{
			if( a[k]!=0)
			{
				System.out.println(a[k]);
				
					
			}
			}
	}
}