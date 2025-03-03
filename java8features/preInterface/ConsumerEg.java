import java.util.function.*;

class ConsumerEg
{
	public static void main(String [] args)
	{
		Consumer<String> c= s->System.out.println(s);
		c.accept("rahul-rathod");
	}
}