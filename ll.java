import java.util.Scanner;
import java.io.*;
class Main
{
	public static void main(String[]args) throws FileNotFoundException
	
	{
	String a="C:\\Users\\Kurra varsha\\OneDrive\\Documents\\Desktop\\pp.txt";
	File file=new File(a); 
	Scanner sc=new Scanner(file);
	int c=0,c1=0;
	while(sc.hasNextLine())
	{
		String b=sc.nextLine();
		String arr[]=b.split(" ");
		for( int i=0;i<=b.length()-1;i++)
		{
			char ch=b.charAt(i);
			c1++;
		}
			System.out.println(c1);
		for ( String temp:arr)
		{	
			c++;
		} 
	}
		System.out.println(c);
	}
}