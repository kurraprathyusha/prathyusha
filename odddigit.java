 class Main
{
	public static void main(String[]args)
	{
		int n=8211,rev=0;
		while(n!=0)
		{
			rev=n%10;
			if(rev%2!=0)
				System.out.println(rev);
			n=n/10;
		}
	}
}