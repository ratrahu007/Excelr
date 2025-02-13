import java.io.*;
class Emp implements Serializable
{

	int eno;
	String ename;

}
class  SerializationFromObject
{

	public static void main(String [] args)throws Exception
	{
		Emp e1= new Emp();
		e1.eno=420;
		e1.ename="Pakistan";
	
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);

		oos.writeObject(e1);
		fos.close();
		oos.close();

		FileInputStream fis= new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e=(Emp)ois.readObject();
		System.out.println(e.eno + "    " +e.ename);
		fis.close();
		ois.close();

	}
}