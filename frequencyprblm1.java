class  Main
{
	public static void main(String[]args)
	{
		int[]a=new int[]{10,20,40,40,10,30,50};
		int[]b=new int[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			int c=1,max=0;

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
				//System.out.println(a[x] + "  " + c);
		
			if(c>max)
			{
			max=c;
					
			}
				System.out.println(a[x] + "  " + max);
		}

		
	}
}