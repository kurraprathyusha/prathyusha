class Main
{	
	public static void main(String[]args)
	{
		Sample s=new Sample();
		s.m1(121,0,1121);	
	}
}
class Sample
{
  	void m1( int n,int r,int copy )
	{
		if(n==0)
		{
			if(copy==n)
			System.out.println("p");
			else
			System.out.println("np");
	
		}
		else
		{
				r=r*10+(n%10);
				n/=10;
				m1(n,r,copy);
		}
	}
}