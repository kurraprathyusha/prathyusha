class Main
{
	public static void main(String[]args)
	{
		String s=new String("hello");
		char[] a=s.toCharArray();//hello
		for(int x=0;x<a.length-1;x++)
		{
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]>a[y])
				{
					char temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
			for(int x=0;x<=a.length-1;x++)
			System.out.println(a[x]);
	}
}