class Main
{
	public static void main(String[]args)
	{
		int[]a=new int[]{10,20,30,40,50,60};
		int x=0,temp=a[0];
		for(int i=0;i<=a.length-2;i=i+2)
		{
			x=a[i];
			a[i]=a[i+1];
			a[i+1]=x;
		}
			for(int i=0;i<=a.length-1;i++)
			{
				System.out.println(a[i]);
			}
			//for(int n:a)
			//System.out.println(n);
		

	}
					
}