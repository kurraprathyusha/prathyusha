class Main
{
	public static void main(String[]args)
	{
		Employee s=new Employee(81,8000,"var","manager");
		System.out.println(s.m1());
		Employee s1=new Employee(14,40000,"vysh","hod");
		System.out.println(s1.m1());
		
	}
}
class Employee
{
	int id,salary;
	String name,dept;

	Employee(int id,int salary,String name,String dept)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;		
		this.dept=dept;
	}
	String m1()
	{
			return name +  " " + dept+" " + id + " "+  salary;

			
	}
}