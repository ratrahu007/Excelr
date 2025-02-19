import java.util.*;
class SetExample
{
	@SuppressWarnings("unchecked")
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
//Using this method used to set the element on the specific index by passing value and index