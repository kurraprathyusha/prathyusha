class Main
{
	public static void main(String[]args)
	{
		Child child=new Child(4,40,"4acres","40cars");
		child.print();
	}
}
class Parent
{
	int land;
	String assects;
	String gadgets;
	Parent (int land,String assects,String gadgets)//int n
	{
		this.land=land;//land=n;
		this.assects=assects;
		this.gadgets=gadgets;
	}
}
class Child extends Parent
{
	int company;
	Child(int company,int land,String assects,String gadgets)
	{
		super(land,assects,gadgets);
		this.company=company;
	}
	void print()
	{
		System.out.println("land = " +  land+ " assects=  " + assects  + " gadgets = " + gadgets  +" company= "+company);
	}
}
