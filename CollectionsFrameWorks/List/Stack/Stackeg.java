import java.util.*;

class Stackeg
{
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		Stack sc= new Stack();
		sc.push(23);
		sc.push(45.0);
		sc.push(null);
		sc.push("KL_Rahul");
		sc.push(23);
		sc.push(null);
		sc.push(false);
		System.out.println(sc);
		boolean b=(boolean)sc.peek();
		System.out.println(b);
		sc.pop();
		System.out.println(sc);
	}
}
/*
Stack is implemented class from the List interface.
Stack is subclass of the vector.
Stack follows the insertion order.
Stack allows duplicate values.
Stack allows multiple null values.
Stack is used to store group of object.
Stack Interanlly follows Lifo datastructre .
Stack is thread safe means synchornized .
Stack has own methods 
	i) push() :- to add elements
	ii)peek() :- to get top element in the stack means last element.
	iii)pop:- to delete last element of stack
Stack is a leggacy collectyion

*/