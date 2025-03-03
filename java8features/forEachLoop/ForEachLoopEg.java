import java.util.*;

class ForEachLoopEg
{
	@SuppressWarnings("Unchecked")
	public static void main(String [] args)
	{
		ArrayList<Integer> al= new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al);
		al.forEach(x->System.out.println(x));
	}
}