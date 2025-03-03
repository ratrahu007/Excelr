import java.util.*;
class LinkedListeg
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		LinkedList l1= new LinkedList();
		l1.add("rahul");
		l1.add(23);
		l1.add(69.0f);
		l1.add(null);
		l1.add(null);
		l1.add("rahul");
		float f1=(float)l1.get(2);
		System.out.println(l1);
		System.out.println(f1);

	}
}
//linkedlist is implemented from the List interface 
//it  use to store group of objects with different datatypes
//it  is allowed multiple null values 
//it is allowed duplicate values
//it follwed insertion order
// it is primarilary used for insertion and deletion because it is follwos the doubllinkedlist data sructure and there is no shifting process in the Linkedlsit
// it is internally growable datastructure
//it is not threadSafe and then not synchronized
// it is collection framework 