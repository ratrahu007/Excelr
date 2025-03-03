import java.util.*;
class LikedHashset
{
	 @SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		LinkedHashSet lhs= new LinkedHashSet();
		lhs.add("rahul");
		lhs.add(04);
		lhs.add(2002.10f);
		lhs.add(null);
		lhs.add(96);
		lhs.add(null);
		lhs.add(04);
		System.out.println(lhs);
	}
}
/*
= LinkedHashSet is implemented class from ther set.
= LinkedHashSet is used to store multiple elemnts with different datatype .
= LinkedHashSet is used to store the group of objects.
= LinkedHashSet is follows insertion order.
= LinkedHashSet allows only one null value.
= LinkedHashSet doen't allows duplicate values.
= LinkedHashSet follws doublyLinkedlist & HashTable datastrucure
= LinkedHashSet is not ThreadSafe means not Synchronized
= LinkedHashSet capacity is 16.
= LinkedHashSet is collection framework
*/	