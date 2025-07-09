import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		int[] a=new int[7];
		int search=56,c=0;
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]=sc.nextInt());
			if(search==a[i])
			c++;
		}
			System.out.println("count is "+ c);
	}
}