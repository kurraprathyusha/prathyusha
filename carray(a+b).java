class Main
{
	public static void main(String[]args)
	{
		int[]a=new int[]{10,20,30};
		int[]b=new int[]{40,50};
		int[]c=new int[a.length+b.length];
		for(int x=a.length-1; x>=0;x--)//2>0
		{
			c[(a.length-1)-x]=a[x];
		}
		int index=a.length;
		for( int x=b.length-1;x>=0;x--)
		{
			c[index]=b[x];
				index++;
		}
			for(int temp:c)
				System.out.println(temp);
	}
}