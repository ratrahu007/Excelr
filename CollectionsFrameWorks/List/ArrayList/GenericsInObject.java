import java.util.*;
class  Emp
{
	int eno;
	String ename;
	
	Emp(int eno, String ename)
	{
		this.eno=eno;
		this.ename=ename;
	}
	public String toString()
	{
		return eno+"    "+ename;
	}
}
class GenericsInObject
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		Emp e1= new Emp(101,"Suraj");
		Emp e2= new Emp (102,"rahul");
		Emp e3= new Emp(103,"Khushal");

		ArrayList<Emp> a1= new ArrayList();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		System.out.println(a1);
	}
}