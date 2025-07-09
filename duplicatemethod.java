class Main
{
	public static void main(String[]args)
	{
		String s=new String("welcomeall");
		//char[] c=s.toCharArray();
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(s.indexOf(c)!=s.lastIndexOf(c))//duplicates
			{
				if(s1.indexOf(c)==-1)
				{
					System.out.print(s1+" ");	
					s1=s1+c;
				}
			}
			//System.out.print(s1+" ");	
			
		}
		
	}
}