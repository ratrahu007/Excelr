class StudentIS
{
	String s1;
	int age ;
	int rollNo;

	static int totalstudents=0 ;

	{


	}	
	static
	{
	
		System.out.println("welcome to our Student Information programme");	
	}
	void Student(String s1,int age,int rollNo)
	{
		this.s1=s1;
		this.age=age;
		this.rollNo=rollNo;
		System.out.println(s1);
		System.out.println(age);
		System.out.println(rollNo);
			totalstudents++;
	}
	static void TotalStudent()
	{
	
		System.out.println("the toatal number of students are :  "+ totalstudents);
  	}
	public static void main( String [] args )
	{

		StudentIS f1= new StudentIS();
		f1.Student("Rahul",25,1);

		StudentIS f2= new StudentIS();
		f2.Student("Rathod",26,2);
		
		StudentIS.TotalStudent();

	}
}