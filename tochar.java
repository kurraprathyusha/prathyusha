class Main
{
	public static void main(String args[])
	{
		String a=new String("hello");
		char [] c=a.toCharArray();//hello
		char[] b=new char[c.length];
		for(int x=0;x<c.length;x++)
		{
			int c1=1;
			if(b[x]=='1')
			{
				continue;
			}
			for(int y=x+1;y<c.length;y++)
			{
				if(c[x]==c[y])
				{
					c1++;
					b[y]='1';	
				}
			}
				if(c1>1)
				System.out.println(c[x]+ " " + c1);
				
		}
	}
}