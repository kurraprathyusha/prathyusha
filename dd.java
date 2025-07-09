class Main
{
	public static void main(String[]args)
	{	
		int[]a=new int[]{10,20,30,40,50,60,70};
		int []b=new int[a.length];
		for(int i=0;i<=a.length-1;i++)
		{			
			if(i==0)
			{
				b[i]=a[i+1]+a[i];
					System.out.println(b[i]);
			}
			else if(i==a.length-1)
			{
				b[i]=a[i]+a[i-1];
					System.out.println(b[i]);
			}
			else 
			{
				b[i]=a[i-1]+a[i+1];
					System.out.println(b[i]);
			}	
		}
	}
}