class Main
{	
	public static void main(String[]args)
	{
		Sample s=new Sample();
		s.m1(15,1);	
	}
}
class Sample
{
  	void m1( int n,int start )
	{
		if(start<=n)
		{
			if(n%start==0)
			{
				System.out.println(start);
				m1(n,start+1);
			}

			else
				m1(n,start+1);
			
		}
	}
			
}
		