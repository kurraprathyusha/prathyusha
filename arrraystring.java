class Main
{
	public static void main(String[]args)
	{


		String a[]=new String[]{"aa","bb","cc","dd","ee"};
		String b[]=new String[a.length];
		int s[]= new int[]{10,21,30,40,51,60};
		int s1[]= new int[a.length];
		for(int i=0;i<=a.length-1;i++)
		{
			String w=(b[i]=a[i]);
				System.out.println(w + " correct order  is ");
		}

		for(int i=a.length-1;i>=0;i--)
		{
			String w=(b[i]=a[i]);
			System.out.println(w + " rev is ");

		}
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2==0)
			{
			String w=( b[i]=a[i]);
				System.out.println(w + " evenindex elements is ");
			}

		}
		for(int i=0;i<=s.length-1;i++)
		{
			if(s[i]%2!=0)
			{
				s1[i]=s[i];
				System.out.println(s1[i] + " oddindex elements");
			}
		}
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2!=0)
			{
			String w=( b[i]=a[i]);
			System.out.println(w + " odd elements is ");
			}

		}
		for(int i=0;i<=((a.length-1)/2);i++)
		{
				String w=( b[i]=a[i]);
				System.out.println(w + " half is ");
		}
		for(int i=((a.length-1)/2);i>=0;i--)
		{
				b[i]=a[i];
				System.out.println(b[i]+ " half in reverse order");
		}
		int min=0;
		for(int i=0;i<=s.length-1;i++)
		{
			if(i%2==0)
			{
			
				s1[i]=s[i];
				System.out.println(s1[i]);
			}
			if(s1[i]>min)
			{
				min=s1[i];
				System.out.println(min);
			}			
		}


















		
	}
}