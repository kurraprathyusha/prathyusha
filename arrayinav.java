class Main
{
	public static void main(String[]args)
	{
		int s=0;
		int arr[]=new int[]{100,90,9};
		for (int i=0;i<=arr.length-1;i++)
		{
			s=s+arr[i];
		}
			System.out.println(s);
		int rem=0;
		while(!(s>=1 && s<=9))
		{
			int s1=0;
			while(s!=0)
			{
				rem=s%10;
				s1=s1+rem;
				s/=10;
			}
				s=s1;
		}
		System.out.println(s==1?"inav":"niv");
	}
}
			