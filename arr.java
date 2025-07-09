import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		int arr[]=new int[]{10,20,30,40};
		for(int i=((arr.length-1)/2);i>=0;i--)
			System.out.println( "first half "+arr[i]);
		for (int j=((arr.length-1)/2)+1;j<=arr.length-1;j++)
			System.out.println(arr[j]);
	}
}