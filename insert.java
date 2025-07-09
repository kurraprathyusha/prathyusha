class Main
{
	public static void main(String[]args)
	{
		int[]a=new int[]{10,20,30,40,50,60,70,80,0};
		int index=4;
		for(int i=a.length-1;i>=index+1;i--)
		{
			a[i]=a[i-1];
				//System.out.println(a[i]);
		}
			a[index]=35;
				
		for(int i=0;i<=a.length-1;i++)
			System.out.println(a[i]);
	}
}