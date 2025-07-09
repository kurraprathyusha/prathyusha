class Main
{
	public static void main(String[]args)
	{
		int s=0,s1=0,c=0;
		int arr[]=new int[]{11,20,2,42,200};
		for (int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2!=0)
			{
				s1=s1+arr[i];
			}
		}
			System.out.println(s1);
		for(int i=0;i<=s1/2;i++)
		{
			if(s1%2==0)
			{
				c++;
				break;
			}
		}
			System.out.println(c==0?"prime":"notprime");		

	}
}