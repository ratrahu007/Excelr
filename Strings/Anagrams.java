import java.util.*;
class Anagrams {

	public static void main( String [] args ) 
	{
		
		String s1 = "listen";

		String s2 ="Kutra";

		char [] a1= s1.toCharArray();

		System.out.println(Arrays.toString(a1));

		char [] a2= s2.toCharArray();

		System.out.println(Arrays.toString(a2));

		Arrays.sort(a1);

		Arrays.sort(a2);

		System.out.println(a1);
		System.out.println(a2);

		if( Arrays.equals(a1,a2))

		{
				System.out.println("String is anagram");


		}
		else
		{
				System.out.println("not anagram");
		}
	}
}
