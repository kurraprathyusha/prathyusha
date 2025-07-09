class Main
{	
	public static void main(String[]args)
	{
		Sample s=new Sample();
		s.m1(5,1,1);	
	}
}
class Sample
{
  	void m1( int start,int end,int prdct )
	{
			if(start==end+1)
			{
				System.out.println(prdct);

			}
			else
			{
				prdct=prdct*start;
				m1(start-1,end,prdct);
			}
		
	}
}