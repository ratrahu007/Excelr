import java.util.*;
class SubListof
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
		
		List l1= a1.subList(0,3);
		System.out.println(l1);

	}
}	