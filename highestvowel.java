class Main
{
	public static void main(String[]args)
	{
			String s=new String("welcome all welcomeall");
			String arr[]=s.split(" ");//welcome,//all
			int max=0;
			String highest="";
			for(int x=0;x<arr.length;x++)

			{
				int c=0;
				String b=arr[x];//welcome
				for(int y=0;y<b.length();y++)
				{
					char ch=b.charAt(y);//w
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					{
						c++;
					}
					
				}
				if(c>max)
				{
					max=c;
					highest=arr[x];
				}
			}
					System.out.println(highest+ " " + max);
	}
			
}
