import java.util.*;
class ReverseWord {

	public static void main( String [] args )
	{
		 String s1 = "jam is";
		 String[] s2=s1.split(" ");
		
		
		System.out.println(Arrays.toString(s2));

		for( int i=0;i<s2.length;i++)
		{
			String res = s2[i];
			String rev="";
			for( int j=res.length()-1;j>=0;j--)
			{	
				
				char s3=res.charAt(j);

				rev = rev+s3;

			}
			System.out.println(rev);
		}
	}
}