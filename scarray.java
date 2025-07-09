import java.util.Scanner;
 class Main
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		int a[]=new int[5];
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]=sc.nextInt());
		}
	}
}