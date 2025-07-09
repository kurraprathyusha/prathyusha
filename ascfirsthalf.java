import java.util.Arrays;
import java.util.Collections;
class Main
{
	public static void main(String []args)
	{
		Integer[]a={10,29,20,34,13,45,50,89};
		int n=a.length;
		int half=(a.length/2);
		Arrays.sort(a,);
		Arrays.sort(a,half,n,Collections.reverseOrder());
		for(int i=0;i<=a.length-1;i++)
			System.out.println(a[i]);
	}
}