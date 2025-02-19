import java.util.*;
class Get
{
	@SuppressWarnings("unchecked")
	public static void main( String [] args)
	{	
		ArrayList a1= new ArrayList ();
		a1.add("Suraj-kumar");
		a1.add("Khushal-kumar");
		a1.add(69);
		a1.add('c');
		System.out.println(a1);

		String s1=(String)a1.get(1);
		System.out.println(s1);
	}
}
//in this method we can access the any element of list based on index 
//IMP* if we access a element without generics we have to maintain explicit typecast 