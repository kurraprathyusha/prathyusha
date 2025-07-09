class Main
{
	public static void main(String[]args)
	{
		String s1=new String("H3 e 7uo 1");
		char[]ch=s1.toCharArray();
		String  a="";
		for(int x=0;x<ch.length;x++)
		{
			if(ch[x]>='0' && ch[x]<='9')
			{
				a=a+ch[x];
			}	
		}
			System.out.println(a);	
		int size=a.length();
		int b=Integer.parseInt(a);
		int s=0,rem=0,copy=b;
		while(b!=0)
		{
			rem=b%10;
			s=s+(int)Math.pow(rem,size);
			b/=10;
		}
			System.out.println(s==copy?"am":"nam");
		
		
	}
}