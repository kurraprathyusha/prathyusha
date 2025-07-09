class Main
{
	public static void main(String[]args)
	{
		String[]a=new String[]{"hi","hello","hi","mrng","hi"};
		String[]b=new String[a.length];	
		int x;
		for(  x=0;x<=a.length-1;x++)
		{
			int c1=1;

			
			if(b[x]=="1")
			{
				continue;
			}
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==(a[y]))
				{
					c1++;
					b[y]="1";
				}
			}
			System.out.println(a[x]+ " "+c1);
		}
							
	}
}