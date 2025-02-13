import java.io.*;
class CharStreamWriter
{
	public static void main( String [] args)throws Exception
	{
		FileWriter fw= new FileWriter("pqr.txt");
		String data= "Hello Smitha";
		char [] ch =data.toCharArray();
		fw.write(data);
		fw.close();

	}
}