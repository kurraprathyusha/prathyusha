class Main
{
	public static void main(String[]args)
	{
		char letter='g';
		if(letter>'a' || letter <='z')
		{
			int l1=(int)letter-32;
			char l2=(char)l1;
				System.out.println(l2);
		}
		else if(letter>'A' || letter <='Z')
		{
			int l1=(int)letter+32;
			char l2=(char)l1;
				System.out.println(l2);
		}
	}
}