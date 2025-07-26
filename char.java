class Main{
	public static void main(String[]args)
	{
		int letter=9;
			if((letter>='A' || letter<='Z') && (letter>='a' || letter<='z' ))
			
				System.out.println("alphabet");
			
			else if(letter>=0 || letter <=9)
			
				System.out.println("number");
			
			else if (letter==' ')
			
				System.out.println("space");
			
			else
				System.out.println("symbl");
	}
}