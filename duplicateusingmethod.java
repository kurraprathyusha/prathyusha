class Main
{
	public static void main(String[]args)
	{
		String s=new String("hello all all good morning good of of");
		String arr[]=s.split(" ");
		for(int x=0;x<arr.length;x++)
		{
			String b=arr[x];
			if(s.indexOf(b)!=s.lastIndexOf(b))
				 System.out.println(b);
		}
	}
}
