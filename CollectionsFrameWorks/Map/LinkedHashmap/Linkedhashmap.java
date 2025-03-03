import java.util.*;

class Linkedhashmap
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		LinkedHashMap<Integer,String> lhm= new LinkedHashMap<>();
		lhm.put(1,"rahul");
		lhm.put(2,"khushal");
		lhm.put(3,"rohan");
		lhm.put(4,"sotya");
		System.out.println(lhm);

	}
}
/*
All points are same just it follows the insertion order and load factor is 0.75


*/