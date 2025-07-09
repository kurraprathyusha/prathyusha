class Main
{
	public static void main (String []args)
	{
		int[]a=new int[]{10,20,34,7,8,56};
		
			int min=0,min1=0,max=0,max1=0;
			for(int x=1;x<=a.length-1;x++)
			{
				if(a[min]>a[x])
				{
					min=x;
					System.out.println(a[min]);
				}
				if(a[max]<a[x])
				{
					max=x;
				}		
			}
				System.out.println(a[max]);
				System.out.println( a[min]+a[max]);

				
	}
}
