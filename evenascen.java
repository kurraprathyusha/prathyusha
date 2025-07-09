import java.util.Arrays;
import java.util.Collections;
class Main
{
	public static void main(String[]args)
	{
		Integer[]a={10,23,45,53,11,12,34,43,556};
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2!=0)
			{
				Arrays.sort(a,Collections.reverseOrder());
			System.out.println(": " +a[i]);
			}
		}
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2==0)
			{
				Arrays.sort(a);
			System.out.println(a[i]);
			}
		}

	}
}