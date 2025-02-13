import java.io.*;
class ByteStreamEg
{
	public static void main( String [] args)throws Exception
	{
		FileInputStream fis= new FileInputStream("Rahul.jpg");
		int size=fis.available();
		byte[] b = new byte[size];
		fis.read(b);
		fis.close();

		FileOutputStream fos= new FileOutputStream("E:\\Excelr\\IOStreams\\IMG_20240923_224425[1].jpg");
		fos.write(b);
		System.out.println("image is copied into Rahul.jpg");
		fos.close();



	}
}