class Main
{
	public static void main(String[]args)
	{
		int[]a=new int[]{12,45,76,87,90,-12,-15,-17};
		int c=0,c1=0,c2=0,c3=0,c4=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>=0)
				c++;		
			 if(a[i]<0)
				c1++;
			if(a[i]%2==0)
				c3++;
			if(a[i]%2!=0)
				c4++;
		}
			System.out.println(" +ve num  = " +c);
			System.out.println(" -ve num  = " +c1);
			System.out.println(" even  num = " +c3);
			System.out.println(" odd num  = " +c4);


			
	}
}