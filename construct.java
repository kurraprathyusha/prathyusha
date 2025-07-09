class Main
{
	public static void main(String[]args)
	{
		Employee s3=new Employee();
		
	}
}
class Employee
{

	Employee ()
	{
		this(120);
		System.out.println(" ");
		
	}
	Employee (int a)
	{
		this("hi");
		System.out.println("hello");
	}
	Employee (String a)
	{
		System.out.println("hi all");
	}
}