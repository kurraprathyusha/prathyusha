		

class Main
{
	public static void main(String[]args)
	{
		int s=0,s1=0,c=0;
		int arr[]=new int[]{11,20,2,42,200};
		for (int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				s=s+arr[i];
				System.out.println(arr[i]);
			}
			
		}
			System.out.println(s);
		int temp=s,rev=0;
			while(s!=0)
			{
				rev=rev*10+(s%10);
				s/=10;
			}
				System.out.println(rev==temp?"palin":"notpalin");
	}
}
