class Main
{
	public static void main (String []args)
	{
		int[] a=new int[]{10,20,345,371,191};
		for(int x=0;x<=a.length-1;x++)
		{
			int n=a[x],copy=n,rem=0,c=0,s=0,c1=0;
			while(n!=0)
			{	
				c++;
				n/=10;
			
			}
			n=copy;
			while(n!=0)
			{
				rem=n%10;
				s=s+(int)(Math.pow(rem,c));
				n/=10;
			}
			if(s==copy)
			{
				c1++;
				System.out.println(c1);
			}
			//else
			//	System.out.println("nam");
		}

	}
}