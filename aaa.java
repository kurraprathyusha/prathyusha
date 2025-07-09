class Main
{
	public static void main(String[]args)
	{
		
		int[] a=new int[]{10,20,30};
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		int[]b=a;
		for( int i=0;i<=a.length-1;i++)
		{
			System.out.println(b[i]);
		}
	}
}