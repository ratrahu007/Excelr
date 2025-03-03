import java.util.*;

class HashMapeg
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		HashMap<Integer,String> hm= new HashMap<>();
		hm.put(1,"rahul");
		hm.put(2,"Khushal");
		hm.put(3,"Suraj");
		hm.put(4,"Black_Vishal");
		hm.put(1,"Suraj");
		hm.put(null,"gotya");
		hm.put(5,null);
		hm.put(6,null);
		System.out.println(hm);

	}
}
/*
=: HashMap is implemented class from the Map Interface
=: HashMap store data in two dimensional i.e Key-Value pair.
=: HashMap is used to store group of objects and multipl values with different datatype.
=: HashMap is allow multiple duplicate values but key msut be unique.
=: Hashmap allow only one null key but multiple null values.
=: HashMap doesn't follow insertion order
=: it internally follows hashatable datastructure and load factor is 0.75.
=: Inital capacity is 16.
=: HashMap is not Synchronized and not thread safe.
=: It is collection framework
*/