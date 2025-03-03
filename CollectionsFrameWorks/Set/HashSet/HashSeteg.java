import java.util.*;

class HashSeteg
{
	   @SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		HashSet hs= new HashSet();
		hs.add("Kill");
		hs.add(69);
		hs.add(69.0f);
		hs.add(true);
		hs.add(null);
		hs.add(null);
		hs.add("Kill");
		hs.add(69);
		System.out.println(hs);
	}
}
/*
*HashSet is implented class from the Set.
*Hashet store the multiple values with different datatype.
*Hashset is used to store group of objects.
*HashSet doesn't follow insertion order .
*HashSet allow only one null value.
*HashSet doesn't allow duplicate values.
*Hashset inital capacity is 16.
*HashSet internally follows HashTable dataStructure.
* loadafctor for Hashset is 0.75.
*HashSet is not threadsafe means not synchronized
*it is Collection framework.
*/