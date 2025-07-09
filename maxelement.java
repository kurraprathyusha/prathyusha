class Main
{	
	public static void main(String[]args)
	{
		int[][]a={{1,2,3},{4,5,6},{7,8,9}};
		int max=0;
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a[x].length;y++)
			{
				if(a[x]a[y]>a[x+1]a[y+1])
				{
					max=a[x]a[y];
				}
			}
				System.out.println(max);}
	}
}