import java.util.stream.*;

import java.util.*;

class FilterMethod
	
{
	public static void  main(String [] args)
	{
	List<Integer> l= List.of(1,2,3,4);
	l.stream().
	filter(a->a>2).
	forEach(y->System.out.println(y));

}
}