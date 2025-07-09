xclass Main
{
	public static void main(String[]args)
	{
		String s=new String("hello all all good morning good of of");
		String arr[]=s.split(" ");
		for(int x=0;x<arr.length;x++)
		{
			//if(s.indexOf(arr[x])!=s.lastIndexOf(arr[x]));
			String a=arr[x];
			String b=arr[x+1];

			if(a.compareTo(b))
			System.out.println(arr[x]);
		}
	}
}