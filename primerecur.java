class Main
{
	public static void main(String[]args)
	{
		Sample s=new Sample();
		s.m1(12,1,11,0);
	}
}
class Sample
{
	void  m1(int n,int start,int end,int count)
	{
		if(start<=end)//1<=11//12<=11f
		{
			if(n%start==0)//1//11
			{
				count++;//1//2
				 m1(n,start+1,end,count);
			}
			else
			{
				m1(n,start+1,end,count);
			}
	
		}
		else
		{
			if(count==2)
			{
				System.out.println("prime");
			}
			else
				System.out.println("np");
		}
	}
		
		
	
}