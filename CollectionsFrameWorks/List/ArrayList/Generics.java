import java.util.*;
class Generics
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		ArrayList<String> a1= new ArrayList();
		a1.add("Rahul");
		a1.add("Suraj");
		a1.add("Khushal");

		System.out.println(a1);
		String res=a1.get(1);
		System.out.println(res);

		System.out.println("=======================================");


		ArrayList a2= new ArrayList();
		a2.add("Rahul");
		a2.add("suraj");
		a2.add("Khushal");

		System.out.println(a2);
		String s2=(String) a2.get(1);
		System.out.println(s2);
	}
}
//Using the generic we can achive typesafety
//Using the generics we can reduce the expicit typecasting 
//We can implement generics using <>...
//it is all about this 