class WithReturnType {

	int add()
	{
		return 5;
	}	
	public static void main(String [] args)
	{
		WithReturnType w1= new WithReturnType();
		 int result =w1.add();		
		System.out.println(result);
	}
}