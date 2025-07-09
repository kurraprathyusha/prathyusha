class Main
{
	public static void main(String[]args)
	{
		int[]a=new int[]{10,-27,-45,11,-42,23,44,34,-19,22,1};
		//Main.s=new Main();
		//s.m1(a);
		
	//}
	//void m1(int[]a)
	//{
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=x+1;y<=a.length-1;y++)
			{
				 if(a[x]>0 && a[x]>a[y])
				{
					 int temp=a[x];
					a[x]=a[y];
					a[y]=temp;	
				}
			}
		}
				for(int temp:a)
						System.out.print(temp + "  ");
	}
}
