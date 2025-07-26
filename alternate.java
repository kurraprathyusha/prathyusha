class Main
{
	public static void main(String[]args)
	{
		int n=273,c=0,rev=0;
		while(n!=0)
		{
			rev=n%10;
				c++;
			if(c%2!=0)
				System.out.println(rev);
			n=n/10;
		}
	}

}