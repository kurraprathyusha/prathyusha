class Main
{
	public static void main(String[]args)
	{
		Student s=new Student();
		System.out.println(s.m1());
		Employee e=new Employee();
		System.out.println(e.m2());
	}
}
class Person
{
	String name;
	String email;
	String role;
	Person()
	{
		name="ss";
		email="@s.gmail.com";
		role="developer";
	}
	String m()
	{
		return name+ " "+ email+" "+role;
	}
}
class 	Student extends Person
{
	int roll;
	String section;
	double per;
	int fee;
	Student()
	{
		roll=14;
		section="b";
		per=86;
		fee=20000;
	}
	String m1()
	{
		
		return roll+ " " +section+" "+per+" "+fee;

	}
}
class Employee extends Person
{
		int id;
		String dept;
		Employee()
		{
			id=101;
			dept="ece";
		}
		String m2()
		{
			super.m();
			return id+ " " +dept;
		}
}













