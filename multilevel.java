class Main
{
	public static void main(String[]args)
	{
		Sample s=new Sample();
		//System.out.println(s.m1());
	}
}
class Sample extends M1,M2
{

	Sample()
	{
	}
}
class M1
{
	int id;
	M1()
	{
		id=20;
	}
		void m1()
		{
			return 20;
		}	
}
	
class M2
{
	int id;
	M1()
	{
		id=20;
	}
		void m1()
		{
			return 30;
		}	
}


}	