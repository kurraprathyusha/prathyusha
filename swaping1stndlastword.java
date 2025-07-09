import java.util.Arrays;
class Main
{
	public static void main(String[]args)
	{
		String s=new String("hello all good morning ");
		String arr[]=s.split(" ");
		 String temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		for(String r1:arr)
		System.out.println(r1);
	}
}
