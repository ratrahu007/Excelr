class ClassRoom
{
	void takeClass(String faculty)
	{
		for( int i=1;i<=10;i++)
		{
			System.out.println(i+ "   class is taking by the :  " +faculty);

			try
			{
				Thread.sleep(2000);

			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}

class UserThread extends Thread
{
		ClassRoom c1;
		String faculty;
		
		UserThread( ClassRoom c1 , String faculty)
		{
			this.c1= c1;
			this.faculty=faculty;
		}

		public void run()
		{
			c1.takeClass(faculty);	
		}
}
public class WithoutSynchronization
{
	public static void main( String [] args )
	{
		ClassRoom c1= new ClassRoom();

		UserThread u1= new UserThread(c1, "Rahul");
		UserThread u2= new UserThread(c1,"Khushal");

		u1.start();
		u2.start();
	}
}