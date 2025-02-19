import java.util.*;
class Remove
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Rav");
		a1.add("Kumar");
		a1.add("jhukya");
		a1.add("ambya");
		a1.add("naru");
		a1.add("rahulya");

		System.out.println(a1);
	
		a1.remove(2);
		System.out.println(a1);
	}
}
//Using remove() method we can remove the element from a list based on index