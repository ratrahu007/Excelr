import java.util.*;
class CountLineAndWords
{

	public static void main(String[] args )
	{
		Scanner sc= new Scanner(System.in);
		int linecount =0;
		int wordcount =0;

		while(true)
		{
			String s1=sc.nextLine();

			if(s1.isEmpty())
			{
				break;
			}
			linecount++;

			String trimedline = s1.trim();
			if(! trimedline.isEmpty())
			{
				String [] words =trimedline.split("\\s+");
				wordcount=wordcount + words.length;
			
				
			}
		}
		System.out.println("Number of lines " + linecount);
		System.out.println("Numbers of words " + wordcount);

	}
}