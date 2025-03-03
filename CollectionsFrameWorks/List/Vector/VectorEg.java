import java.util.*;
class VectorEg
{
	 	@SuppressWarnings("unchecked")
	public static void main( String [] args)
	{
		Vector v1=new Vector();
		v1.add(23);
		v1.add("rago");
		v1.add(69.3);
		v1.add(null);
		v1.add(null);
		v1.add(23);
		v1.add(true);
		System.out.println(v1);
		

	}
}
/*
.Vector is impleneted class from the list.
.Vector purpose is to store multiple values wit different datatype.
.Vector purpose is to store group of objects.
.Vector allows multiple null values.
.Vector allows duplicate values.
.Vector internally follows automatic growable nature
.Vector by default capacity is 10.
.Vector is legacy collection.
.Vector is thread safe and synchronized.
.Vector follows insertion order.
*/