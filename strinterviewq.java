class Main
{
	public static void main(String[]arggs)
	{
		String s=new String("hello all good morning");
		String a="",b="";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
			a =a+c;
			}
			else if(c!=' ' )
			{
			b=b+c;
			}
		}
			System.out.println(s=a+b);

	}
}