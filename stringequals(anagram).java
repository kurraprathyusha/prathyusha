import java.util.Arrays;
class Main
{
	public static void main(String[]args)
	{
		String s1=new String("nlpl");
		String s2=new String("kyt");
		char[]c=s1.toCharArray();
		char[]d=s2.toCharArray();
		if(c.length==d.length)
		{
			Arrays.sort(c);
			Arrays.sort(d);
			if(Arrays.compare(c,d)==0)
				System.out.println("anagram");	
			else
				System.out.println("na");
		}
		else
			System.out.println("length not same");
			
	}
}