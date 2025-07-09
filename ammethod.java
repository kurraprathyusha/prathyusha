class Main
{
	public static void main(String[]args)
	{
		String s1=new String("H1e15o3");
		int size=s1.length();
		int a=Integer.parseInt(s1);
		System.out.println(a);
		int s=0,rem=0,copy=a;
		while(a!=0)
		{
			rem=a%10;
			s=s+(int)Math.pow(rem,size);
			a/=10;
		}
		System.out.println(s==copy?"am":"nam");
		
	}
}