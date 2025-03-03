import java.util.*;

class IteratoraEg
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		ArrayList al= new ArrayList();
		al.add(5);
		al.add(6);
		al.add(7);
		
		System.out.println(al);

		Iterator a1=al.iterator();
		
		while(a1.hasNext())
		{
			Integer i2= (Integer)a1.next();
			if(i2%2==0)
			{
				System.out.println(i2);
			}
			else
			{
				a1.remove();
			}			
		}
		System.out.println(al);
	}
}
/*
Iterator is the universal iterator
=: Using the iterator we can read the object and remove the data.
=: Iterator is one directional in forward move.
=: Iterator have method like hasNext(),next(),and remove();
*/