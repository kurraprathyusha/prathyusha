class Main
{
	public static void main(String[]args)
	{
		int f=0,s=1,t=0,sum=0;
		for(int i=1;i<=11;i++)
		{
			System.out.println(f);
			t=f+s;
			f=s;
			s=t;
			sum=sum+f;
		}	
			System.out.println(sum);
	}
}