import java.util.*;
class ConationsOf
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
	
		boolean b1= a1.contains("jhukya:");
		System.out.println(b1);
	}
}
//Contains() method check a element is present inm list or not if present return true either false