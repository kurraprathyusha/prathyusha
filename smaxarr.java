class Main
{
	public static void main(String[]args)
	{
			int[]a=new int[]{10,20,30,80};
			int max=Integer.MIN_VALUE;
			int smax=Integer.MIN_VALUE;
			for(int x=0;x<=a.length-1;x++)
			{
				if(max<a[x])
				{
					smax=max;
					max=a[x];
				}	
			
				else if(a[x]<max && a[x]>smax)
				{
					smax=a[x];				
				}
				
			}
				System.out.print( max + "  "+smax);
	}
}
