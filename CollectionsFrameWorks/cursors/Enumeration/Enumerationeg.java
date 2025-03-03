import java.util.*;

class Enumerationeg
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		Vector<Integer> v1= new Vector();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		System.out.println(v1);

		Enumeration e= v1.elements();
		while(e.hasMoreElements())
		{

			Integer i1= (Integer)e.nextElement();
		}
		System.out.println(v1);
	}
}
/*
=: Enueration is the one type of cursor.
=: Enumeration iterate object one by one of a colection.
=:Enumeration has two methods hasMoreElements and nextElement()
=: Enumeration is used to read the data 
=: Enumeration works on only legaccy collection.
*/