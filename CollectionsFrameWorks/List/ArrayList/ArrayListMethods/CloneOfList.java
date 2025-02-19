import java.util.*;
class CloneOfList
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
		a1.add(1001);
		ArrayList<Integer> a2=a1;

		System.out.println(a1);
		System.out.println(a2);
//This is call deep copy

	ArrayList<Integer> a3= new ArrayList <Integer>();
		a3.add(10);
		a3.add(40);
		a3.add(90);
		a3.add(5);
		a3.add(9);
		a3.add(100);
		a3.add(1001);

		ArrayList<Integer> a4=(ArrayList<Integer>)a3.clone();
		System.out.println(a4);

}
}