import java.util.*;

class getIndexOf
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		ArrayList a1= new ArrayList();
		a1.add(96);
		a1.add(69);
		a1.add("Suraj");
		a1.add(96);
		System.out.println(a1);
		int a=a1.indexOf("Suraj");
		System.out.println(a);
		int b =a1.lastIndexOf(96);
		System.out.println(b);
	}
}
//IndexOf givves first ocurennce index and lastIndexOf gives the last index of element