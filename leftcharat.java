class Main
{
	public static void main(String args[])
	{
		String a=new String("hello");
		char [] c=a.toCharArray();//hello
		char temp=c[0];
		for(int x=0;x<c.length-1;x++)
		{
				c[x]=c[x+1];
				System.out.println(c[x]);
		}
			System.out.println(c[c.length-1]=temp);
	}
}