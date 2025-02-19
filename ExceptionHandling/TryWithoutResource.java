import java.io.*;
class  TryWithoutResource
{
	public static void main( String [] args)
	{
		FileInputStream fis =null ;
		try
		{

			fis = new FileInputStream("Rahul.txt");
		}
		catch(FileNotFoundException e)
		{
		}
		finally
			{
				try
				{
					if(fis!=null)
					{
						fis.close();
					}
				}
				catch(IOException e)
				{
				}
			}

	}
}