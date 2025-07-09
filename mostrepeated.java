class Main
{
	public static void main(String[]args)
	{
		String s=new String("hello all all  all good morning good of of");
		String arr[]=s.split(" ");
		boolean[] b=new boolean[arr.length];
		int max=0;
		String repeat="";
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
			if(max<c)
			{
				max=c;
				repeat=arr[x];
			}			

		}
			System.out.println(repeat );

	}
}
