class Main{                      
	public static void main(String[]args)
	{
		int n=1234,c=0,r=0,s=0,s1=0,c4=0,n1=n;
		while(n!=0)
		{
			c++;
			 n=n/10;
		}
		n=n1;
		while(n!=0)
		{
			r=n%10;
			c4++;//4
			if(c4<=c/2)
				s=s+r;
			 if(c4>c/2)
				s1=s1+r;
			n=n/10;
			
		}
			System.out.println(s+s1);
	
	}
}