class Main
{
	public static void main(String[]args)
	{
		int n=371,rev=0;
		while(n!=0)
		{
			rev=rev*10+(n%10);
				System.out.println(rev);
			n=n/10;
		}
	}
}