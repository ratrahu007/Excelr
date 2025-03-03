import java.util.function.*;

class Predicateeg
{
	public static void main(String[] args)
	{
		Predicate<Integer> p=n->n>0;
		Boolean res = p.test(-7);
		System.out.println(res);
	}
}