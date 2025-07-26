class Main
{
	public static void main(String[]args)
	{
		int n=11,c=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				c++;
		}
			if(c==0)
				System.out.println("prime");
			else
				System.out.println("not prime");
	}
}