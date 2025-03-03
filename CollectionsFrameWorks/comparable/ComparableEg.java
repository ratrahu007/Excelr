import java.util.*;

class Student implements Comparable<Student>
{
	int sno;
	String sname;

	Student(int sno,String sname)
	{
		this.sno=sno;
		this.sname=sname;
	}
	public int compareTo(Student s)
	{
		if(sno>s.sno)
		{
			return 1;
		}
		else if(sno<s.sno)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	public String toString()
	{

		return sno+"  "+sname;
	}
}
class ComparableEg
{
	public static void main(String [] args)
	{
		Student s1= new Student(12,"rahul");
		Student s2= new Student(2,"venky");
		Student s3= new Student(32,"muslim");

		ArrayList<Student> al= new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al);

		for(Student res: al)
		{
			System.out.println(res);
		}
	}
}