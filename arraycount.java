import java .util.Scanner;
class Main
{
		public static void main(String[]args)
	{
		int c1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		int[]a =new int[6];
			for(int i=0;i<=a.length-1;i++)
			{
				c1++;
				System.out.println(a[i]=sc.nextInt());
			}
				System.out.println("a length is " + c1);   //a length using count
		System.out.println("enter the characters");
		char[]c=new char[4];
		int c2=0;
			for(int i=0;i<c.length-1;i++)
			{
				c2++;
				System.out.println(c[i]=sc.next().charAt(0));
			}
				System.out.println("c length is " +c2);   //length of c using count
		System.out.println("enter the strings");	
		String[]s=new String[6];
		int c3=0;
			for(int i=0;i<=s.length-1;i++)
			{
				c3++;
				System.out.println(s[i]=sc.next());
			}		
				System.out.println("s length is "+c3);   // length of s using count
		System.out.println("enter the Booleans");
		boolean[]b=new boolean[5];
			for(int i=0;i<=b.length-1;i++)
				System.out.println(b[i]=sc.nextBoolean());
}
}