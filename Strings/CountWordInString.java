import java.util.*;
class CountWordInString {

	public static void main( String[] args ) 
	{
		String s1 = "jam is";

		String []  s2 = s1.split(" ");

		System.out.println(Arrays.toString(s2));
		
		for(int i=0;i<s2.length;i++)
		{
			String res = s2[i];
			int count= res.length();
			System.out.println(  res  +   "    "   +     count);
		}		
	}
}