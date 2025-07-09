class Main
{
	public static void main(String[]args)
	{
		int[]a=new int[]{10,20,30,400,50,79};
		int s=0;
		for(int i=0;i<=a.length-1;i++)
		{
			s=s+a[i];
		}
			System.out.println("sum is " +s);	
	}
}