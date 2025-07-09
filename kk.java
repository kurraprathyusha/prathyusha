class Main
{
	public static void main(String[]args)
	{
		int[] a=new int[]{10,20,30};
		int[]b=new int[]{40,50,60,70};
		int[]c=new int[a.length-1+b.length-1];
		{
			for( c<=a.length-1+b.length-1)
			{

			for(int i=0;i<=a.length-1;i++)
			{
				c[i]=a[i];
				System.out.println(c[i]);
			}
			for(int i=0;i<=b.length-1;i++)
			{
				c[i]=b[i];
				System.out.println(c[i]);
			}
			}
		}
	}
}	