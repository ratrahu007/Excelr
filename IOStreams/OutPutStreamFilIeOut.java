import java.io.*;
class  OutPutStreamFilIeOut
{
	public static void main( String [] args) throws Exception
	{
		FileOutputStream fos= new FileOutputStream("abc.txt");

		String s1="rahul";
		byte [] b =s1.getBytes();

		fos.write(b);
		fos.close();



	}
}