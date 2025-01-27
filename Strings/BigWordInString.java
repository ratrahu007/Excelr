import java.util.*;
class BigWordInString {

	public static void main( String[] args )

	{

			String s1 = "jam is";

		String []  s2 = s1.split(" ");
		String big="";
		int max =0;
		System.out.println(Arrays.toString(s2));
		
		for(int i=0;i<s2.length;i++)
		{
			
			String res = s2[i];
			int count= res.length();
			
			if(max<count)
			{
				max = count;

				big= res;
			}
				
		}	
		System.out.println(" The Word is Big     "   +  big );	
	}
}