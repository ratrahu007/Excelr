import java.util.*;
class VariableArgumentlength {

	void add(int... a)
	{
		System.out.println(Arrays.toString(a));
		System.out.println(b);
	}
	public static void main( String [] args )
	{
		
	 VariableArgumentlength s1= new  VariableArgumentlength();
	s1.add(2,3,5);

	}
}