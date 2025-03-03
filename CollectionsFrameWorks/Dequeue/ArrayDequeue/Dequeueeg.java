import java.util.*;

class Dequeueeg
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		ArrayDeque aq= new ArrayDeque();
		aq.add(69);
		aq.add(96.0f);
		aq.add("Rahul");
		aq.add(true);	
		aq.add('f');
		aq.add(69);
		//aq.add(null);
		System.out.println(aq);

	}
}
/*
=: ArrayDeque is implemented class from Deque interface.
=:ArrayDeque is used to store group of objects.
=: ArrayDeque is store multiple values with different datatypes.
=: ArrayDequeis follows insertion order.
=: it allows duplicaate values.
=: doesnt allow null values.
=: operation performs at head and tail
on onwarads...
*/