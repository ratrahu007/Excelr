import java.io.*;

class InputFileInputStream
{
	public static void main( String [] args)throws Exception
	{	
		FileInputStream fis= new FileInputStream("abc.txt");

		int size =fis.available();
		byte [] b= new byte[size];
		fis.read(b);
		String s1=new String(b);
		System.out.println(s1);
		fis.close();
	}
}