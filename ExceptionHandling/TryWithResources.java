import java.io.*;

class TryWithResources
{
	public static void main( String [] args)
	{
		try(FileInputStream fis = new FileInputStream("lavender.txt"))
		{


		}
		catch(Exception e)
		{
			System.out.println("file closed bro");
		}
	}
}