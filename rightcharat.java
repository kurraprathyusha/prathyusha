class Main
{
	public static void main(String args[])
	{
		String a=new String("hello");
		char [] c=a.toCharArray();//hello
		char temp=c[c.length-1];
		for(int x=c.length-1;x>0;x--)
		{
				c[x]=c[x-1];
				System.out.println(c[x]);
		}
			System.out.println(c[0]=temp);
	}
}
