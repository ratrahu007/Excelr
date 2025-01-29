import java.util.*;
class SumOfDynamicArray
{
	int sumOfArray(int [] a,int size)
	{
		int sum =0;
	for(int i=0;i<a.length;i++)
	{
		sum= sum+a[i];

	}
		return sum;
	}
	public static void main(String [] args )
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("How many Elemnts you want to store");
		int size= sc.nextInt();
		int [] arr = new int [size];

		for(int i=0;i<size;i++)
		{
	
			arr[i]=sc.nextInt();

		}
		System.out.println(Arrays.toString(arr));
		SumOfDynamicArray total= new SumOfDynamicArray();
		System.out.println("The Sum Of That Array Is   :-:  "+total.sumOfArray(arr,size));	


	}
}