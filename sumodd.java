class Main
{
	public static void main(String[]args)
	{
		int n=1435678,c=0,copy=n,rev=0,sumodd=0.sumeven=0;
		while(n!=0)
		{
			c++;
			n=n/10;
		}
		n=copy;
		while(n!=0)
		{
			rev=n%10;
			if(c%2!=0)
			sumodd=sumodd+rev;
			 if(c%2==0)
			sumeven=sumeven+rev;
			n=n/10;
		}
			System.out.println(sumodd*sumeven);
	}
}