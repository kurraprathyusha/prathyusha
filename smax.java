class Main
{
	public static void main(String[]args)
	{
		int[] a=new int[]{10,50,20,40,67,89};
		int x,c=0;
		for( x=0;x<=a.length-1;x++)
		{
			int max=x;

			for(int y=x+1;y<=a.length-1;y++)
			{	
				if(a[max]>a[y])
				{
					max=y;
					c++;
					if(c==2)
						break;
					
				}
			}
				int temp=a[x];
				a[x]=a[max];
				a[max]=temp;
		}
				System.out.println(a[1]);
	}
}
