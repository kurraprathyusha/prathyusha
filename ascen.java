import java.util.Arrays;
import java.util.Collections;
class Main
{
	public static void main(String[]args)
	{
		Integer[] a={10,40,20,60,44,99,56};
		for(int i=0;i<=(a.length-1);i++)
		{
			Arrays.sort(a);
			System.out.println(a[i]);
		}
			System.out.println();
		for(int i=0;i<=a.length-1;i++)
		{
			Arrays.sort(a ,Collections.reverseOrder());
				System.out.println(a[i]);
		}
	}

}	