class staticMethodex4
{
		// As java check line by line static blocks exceute based on the order you declared 
	
		static int a =23,b,max;
		
		static// static blocks are used for initilize static variables 
		{

			System.out.println("static block 2");
			max=67;
			a=1;

		}
		static void display()
		{
			System.out.println("a=="+a);
			System.out.println("b=="+b);
			System.out.println("max=="+max);

		}
		public static void main(String args[])
		{

			display();

		}
		static
		{

			System.out.println("static block 1");
			b=a*4;

		}


	


}