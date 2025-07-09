import java.util.Arrays;
class Main
{
	public static void main(String[]args)
	{
		String s1=new String("cat");
		String s2=new String("act");
		char[]c=s1.toCharArray();
		char[]d=s2.toCharArray();
		if(c.length==d.length)
		{
			Arrays.sort(c);
			Arrays.sort(d);
		}
			if(Arrays.compare(c,d)==0)
				System.out.println("anagram");
			else
				System.out.println("na");
	}
}