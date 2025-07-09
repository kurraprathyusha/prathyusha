class Main
{
	public static void main(String[]args)
	{
		int[]a=new int[]{10,11,23,44,34,22,1};
		//Main.s=new Main();
		//s.m1(a);
		
	//}
	//void m1(int[]a)
	//{
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(x%2==0 && y%2==0 && a[x]>a[y])
				{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;

				}
				else if(x%2!=0 && y%2!=0 && a[x]<a[y])
				{
					int temp1=a[x];
					a[x]=a[y];
					a[y]=temp1;
				}
			}
		}
				for(int temp:a)
						System.out.print(temp + "  ");
	}
}
