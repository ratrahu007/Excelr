import java.util.*;
class SortAnddesort
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		ArrayList a1= new ArrayList();
		a1.add(10);
		a1.add(40);
		a1.add(90);
		a1.add(5);
		a1.add(9);
		a1.add(100);

		System.out.println(a1);
	
		 Collections.sort(a1);
		System.out.println(a1);
		System.out.println("====================================================");

		// sort array in descending order
		Collections.sort(a1,Collections.reverseOrder());
		System.out.println(a1);
	}
}
// Using this method we can sort the array in asecending and descending
