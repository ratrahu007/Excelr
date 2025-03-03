import java.util.*;
class MaxValue
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		ArrayList<Integer> a1= new ArrayList <Integer>();
		a1.add(10);
		a1.add(40);
		a1.add(90);
		a1.add(5);
		a1.add(9);
		a1.add(100);

		System.out.println(a1);
		int a=Collections.max(a1);
		System.out.println(a);

		System.out.println(a1);
		int b=Collections.min(a1);
		System.out.println(b);

}
}
//Using min and max() method we can get maximum and minimum value from the List 