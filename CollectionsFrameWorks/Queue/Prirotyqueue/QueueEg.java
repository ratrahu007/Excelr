import java.util.*;
class QueueEg
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		PriorityQueue pq= new PriorityQueue();
		pq.offer(96);
		pq.offer(69);
		pq.offer(72);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
	}
}
/*
=: PriorityQueue  is implemrnted class from Queue interface.
=: 	PriorityQueue  is used to store multiple values with same dataype.
=: 	PriorityQueue  is used to store group of objects.
=: 	PriorityQueue is doesn't follow insertion order.
=: 	PriorityQueue is doesn't allow null values .
=:	PriorityQueue is allow duplicate values .
=: 	PriorityQueue follwos FIFO Data-Structure method 
=:  in 	PriorityQueue  data will be added at tail means rear and data can be delete at head means front 
=: it is own method
	i)offer() to add the data
	ii) peek() to get the data of head.
	iii) poll() method to delet head data.
*/