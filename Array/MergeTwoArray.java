import java.util.*;
class MergeTwoArray {

	public static void main( String [] args ) 
	
	{
		int [] a= {1,2,3,4};
		int [] b= {5,6,7,8};
		
		int l1=a.length;
		 int l2=b.length;

		int [] mergedarray = new int[l1+l2];
		for( int i=0;i<l1;i++)
		{
			mergedarray[i] = a[i];

		}

		for(int i=0;i<l2;i++)
		{
			mergedarray[l1+i]=b[i];

		}
			System.out.println(Arrays.toString(mergedarray));

	}
}