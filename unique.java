class Main
{
	public static void main (String []args)
	{
		int[]a=new int[]{10,20,34,32,20,10,67,90,87,87,90};
		int[]b=new int[a.length];
			for(int x=0;x<=a.length-1;x++)
			{
				int c=1;
				if(b[x]==1)
				{
					continue;
				}		
				for(int y=x+1;y<=a.length-1;y++)
				{	
					if(a[x]==a[y])
					{
						c++;
						b[y]=1;
					}
				}
					if(c==1)//unique
						System.out.println(a[x]);
			}
	}
}
0