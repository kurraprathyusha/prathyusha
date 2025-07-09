class Main
{
	public static void main(String[]args)
	{
		int[]a=new int[]{10,20,35,67,89,44};
		

		for(int i=0;i<=a.length-1;i++)
		{
			int max=i;
			for(int x=i+1;x<=a.length-1;x++)
			{
				if(a[max]<a[x])
					max=x;
			}
				int temp=a[i];
				a[i]=a[max];
				a[max]=temp;	
				System.out.println(a[i]);	
		}
	}
		
}