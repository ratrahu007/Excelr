import java.util.*;
class Student
{
	int sno;
	String sname;

	Student( int sno, String sname)
	{
		this.sno=sno;
		this.sname=sname;
	}

	public String toString()
	{
		return sno+"     "+sname;
	}

}
class ObjectInLinkedList
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		Student s1= new Student(12,"rahul");
		Student s2= new Student(13,"Khushal");
		Student s3= new Student(14,"Suraj");

		LinkedList<Student> l1= new LinkedList<>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		System.out.println(l1);
		Student l2=l1.get(1);
		System.out.println(l2);
	}
}