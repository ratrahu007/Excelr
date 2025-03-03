import java.util.*;

class ListIteratoreg
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		ArrayList<String> al= new ArrayList();
		al.add("dhoni");
		al.add("Yuvraj");
		al.add("virat");
		al.add("Rohit");
		System.out.println(al);

		ListIterator l1= al.listIterator();
		while(l1.hasNext())
		{
			String s1= (String)l1.next();
			
			if(s1.equals("Yuvraj"))
				{
					l1.remove();
				}
			if(s1.equals("dhoni"))
				{
					l1.set("klrahul");
				}
			if(s1.equals("Rohit"))
				{

					l1.add("gill");
				}
		}
		System.out.println(al);
	}
}
/*
=: ListIterator works on list collection .
=: ListIterator works in bidirection.
=: listiterator perform data reading as well as reoving and adding the data 
=: 
*/