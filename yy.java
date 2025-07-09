class Main
{
	public static void main(String[]args)
	{
			String s=new String("welcome all");
			String arr[]=s.split(" ");//welcome,//all
			for(int x=0;x<arr.length;x++)
			{
				int c=0;
				String b=arr[x];//welcome
				for(int y=0;y<b.length();y++)
				{
					char ch=b.charAt(y);//w
					char d=(char)ch+32;
					
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					{
						c++;
					}
					
				}
					System.out.println(b + " " +c);
			}
			
	}
}