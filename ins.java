class Main
{
	public static void main(String[]args)
	{
		Diff diff=new Diff();
		diff.roll=14;diff.fee=20000;diff.name="aaa";
		diff .m1=19;diff.m2=19;diff.m3=18;
		System.out.println(diff.total());
		int total=diff.total();
		diff.m1(total);
		
	}
}
class Diff
{
	String name,section;
	int roll,fee,m1,m2,m3;
	int total()
	{
		return m1+m2+m3;

	}
	void m1(int total)
	{
		System.out.println((total/300.0)*100);
	}
}