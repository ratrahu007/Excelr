import java.util.function.*;

class Functiooneg
{
	public static void main(String [] args)
	{
		Function<Integer,Integer> f= a->a*a;
		int res =f.apply(5);
		System.out.println(res);
	}
}