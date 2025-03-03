import java.util.*;

class OptionalClass
{

	public static void main(String [] args)
	{
		String s1="Kamli";
		Optional<String> o =Optional.ofNullable(s1);
		if(o.isPresent())
		{
			System.out.println(o.get());
		}
		else
		{
			String s2= o.orElse("Kuch nhi Usme");
			System.out.println("Kuch to Add kr     "+s2);
		}
	}
}