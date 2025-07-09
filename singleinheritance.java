class Main
{
	public static void main(String[]args)
	{
		Child child=new Child();
		System.out.println(child.land+" "+child.salary);
	}
}
class Parent
{
	int land=40;
}
class Child extends Parent
{
	int salary=400000;
	
}
