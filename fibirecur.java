class Main
{	
	public static void main(String[]args)
	{
		Sample s=new Sample();
		s.m1(4,0,1,0,0);	
	}
}
class Sample
{
  	void m1( int n,int f,int s,int t ,int start)
	{
		if(start==n)
		{
			System.out.println(f);
		}
		else
		{+
			t=f+s;
			f=s;
			s=t;
			 m1(n,f,s,t,start+1);
		}
	}
}
