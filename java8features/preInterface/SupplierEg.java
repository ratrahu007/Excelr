import java.util.function.*;
import java.util.Date;

class SupplierEg

{
	public static void main(String [] args)
	{
		Supplier<Date> s=()->new Date();
		System.out.println(s.get());
		System.out.println(s.get());
	}
}