import java.io.*;
class CharStreamReader
{
	public static void main( String [] args ) throws Exception
	{
		FileReader fr= new FileReader("pqr.txt");
		
		String data=" ";
		int av=fr.read();
		while(av!=-1)
		{	
			data= data+(char)av;
			av=fr.read();

		}
		System.out.println(data);
		fr.close();
	}
}