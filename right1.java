class Main
{
	public static void main(String[]args)
	{
	int[] a=new int[]{10,20,30,40,50,60,70};
	for(int x=0;x<5;x++)
	{
		int last=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=last;
	}
		

	
		for(int j=0;j<=a.length-1;j++)
			System.out.println(a[j]);

}
}