import java.util.*;
class AddAll
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		ArrayList a1=new ArrayList();
		a1.add("Suraj");
		a1.add(96);
		a1.add(46.0);
		ArrayList a2=new ArrayList();
		a2.addAll(a1);

		a2.add(4);		
		a2.add(9);
		System.out.println(a2);
	}
}
//it add mutiple elemrnt at a time using addAll();