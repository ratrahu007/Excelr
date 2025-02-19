import java.util.*;
class Set
{
	@SurppressWarnings("unchecked");
	public static void main(String [] args)
	{
		ArrayList a1= new ArrayList();
		a1.add(96);
		a1.add(69);
		a1.add("Suraj");
		System.out.println(a1);
		a1.set(0,"rahul");
		System.out.println(a1);
	}
}