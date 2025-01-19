import java.util.Arrays;
class CopyOneToOther {

	public static void main( String [] args )
	{

		int [] a= {1,2,3,4,5,6};

		int l= a.length;

		int [] b= new int [l] ;

		for( int i=0 ;i<l;i++)
		{

			b[i] = a[i];

		}

		System.out.println( " The New array is " + Arrays.toString(b));
	}
}