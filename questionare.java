import java.util.Scanner;
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
				System.out.println("a length is " + c1);
			}
				System.out.println("a length is " +a.length);   //a length
		System.out.println("enter the characters");
		char[]c=new char[4];
			for(int i=0;i<c.length-1;i++)
			{
				System.out.println(c[i]=sc.next().charAt(0));
			}
				System.out.println("c length is " +c.length);   //length of c
		System.out.println("enter the strings");	
		String[]s=new String[6];
			for(int i=0;i<=s.length-1;i++)
			{
				System.out.println(s[i]=sc.next());
			}		
				System.out.println("s length is "+s.length);   // length of s
		System.out.println("enter the Booleans");
		boolean[]b=new boolean[5];
			for(int i=0;i<=b.length-1;i++)
				System.out.println(b[i]=sc.nextBoolean());

	}
}