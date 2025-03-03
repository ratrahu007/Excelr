import java.util.stream.*;
import java.util.*;

class MapMethod
{
	public static void main(String [] args)
	{
		List<Integer> l= List.of(1,2,3,4,5);
		l.stream().map(x->x+2).forEach(y->System.out.println(y));
	}
}