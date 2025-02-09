class  Demo
{

	private int eno;
	private String ename;

	public void setEno(int eno)
	{
		this.eno= eno;
	}
	public void getEno()
	{
		System.out.println(eno);
	}
	public void setEname(String ename)
	{
		this.ename= ename;
	}
	public void getEname()
	{
		System.out.println(ename);
	}	
}
class Encapsulation
{

	public static void main( String [] args )
	{
		Demo d1= new Demo();
		d1.setEno(23);
		d1.getEno();
		d1.setEname("Hari");
		d1.getEname();


	}
}