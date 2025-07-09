class Main
{
	public static void main(String[]args)
	{
		Child c=new Child();
	}
}
class Child extends Parent
{
	
}
class Parent
{
	Parent()
	{
		System.out.println("hi");
	}
}