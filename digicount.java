 class Main
{
	public static void main(String[]args)
	{
		int n=281,rev=0,c=0;
		while(n!=0)
		{
			rev=n%10;
			c++;
			System.out.println(c);
			n=n/10;
		}
	}
}
