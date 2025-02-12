class SetAndGetThreadName extends Thread
{
		public static void main (String [] args )
		{
			System.out.println(Thread.currentThread().getName());//main is thread name is here 
			
			Thread.currentThread().setName("rahulThread");
			System.out.println(Thread.currentThread().getName());

		}

}