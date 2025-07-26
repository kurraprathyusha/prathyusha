class Main
{
	public static void main(String[]args)
	{
		int n=121,c=0,copy=n,rem=0,sum=0;
		while(n!=0)
		{
			c++;
			n=n/10;
		}
		n=copy;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+(int)Math.pow(rem,c);
			n=n/10;
		}
			if(sum==copy)
				System.out.println("am");
			else
				System.out.println("na");
	}
}