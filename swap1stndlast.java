class Main
{
	public static void main(String[]args)
	{
		String s=new String("hello good morning");
		String arr[]=s.split(" ");
			for(int x=0;x<arr.length;x++)
			{
				char c='0',c1='0',temp=0;
				String b=arr[x];//hello
				for(int y=0;y<b.length();y++)
				{
					 c=b.charAt(0);
					 c1=b.charAt(b.length()-1);
					 temp=c;
					c=c1;
					c1=temp;
					System.out.println(c+ " " +c1);
				}
					//for(String temp:arr)
						System.out.println(temp);

						
			}
				
	}
}