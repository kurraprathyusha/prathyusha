class Main
{
	public static void main(String[]args)
	{
		int n=659767,rev=0,a=0,c=0;
		char d='0',e='0';
		while(n!=0)
		{
			rev=n%100;
			char b=(char)rev;
			if(b>='a'||b<='z')
			{
				a=(int)b-32;
				 d=(char)a;
				System.out.println(d);

			}
			else if(b>='A'||b<='Z')
			{
				 c=(int)b+32;
				e=(char)c;
				System.out.println(d);

			}
			n=n/100;
		}
			
	}
}