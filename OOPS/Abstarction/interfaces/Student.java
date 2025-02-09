class Person
{
	int hands=2;
	int legs=2;
}
class Student extends Person
{
	int sno=12;
	String sname="Hemanth Babu";
	void getStudent()
	{
		System.out.println("sno"+sno+" "+"sname"+sname+" "+"hands"+hands+" "+"legs"+legs);
	}
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.getStudent();

	}
}
