class Main
{
	public static void main(String[]args)
	{
		String s=new String("hello all all good morning good of of");
		String arr[]=s.split(" ");
		boolean[] b=new boolean[arr.length];//intially assignes to 0
		for(int x=0;x<arr.length;x++)
		{	
			int c=1;
			if(b[x])//true

				continue;//skips
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x].equals(arr[y]))
				{
					c++;
					b[y]=true;
				}
			}
			if(c>1)
					System.out.println(arr[x ]+ "-> "+c);

		}
	}
}
