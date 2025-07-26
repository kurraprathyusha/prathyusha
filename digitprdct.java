class Main
{
	public static void main(String[]args)
	{
		 int n=821,p=1,rev=0;
		while(n!=0)
		{
			rev=n%10;
			p=p*rev;
			n=n/10;
		}
			System.out.println(p);
	}
}