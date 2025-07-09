class Main//hierarchi
{
	public static void main(String args[])
	{
		Student s=new Student("abc",14,414,"usha","ece");
		s.m1();
		Child c=new Child(11,414,"var","eee");
		c.m2(); 
	}
}
class Employee//parent 
{
	int id;
	String name;
	String dept;
	Employee(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
}
class Student extends Employee//child1
{
	String class1;
	int age;
	Student(String class1,int age,int id,String name,String dept)
	{
		super(id,name,dept);
		this.class1=class1;
		this.age=age;
			}
	void m1()
	{
		System.out.println(class1 + " " + age + " " +id+ " " + name+ " " + dept);
	}
}
class Child extends Employee//child2
{
	int num;
	Child(int num,int id,String name,String dept)
	{
		super(id,name,dept);
		this .num=num;
			}
	void m2()
	{
		System.out.println(num + " " +id+ " " + name+ " " + dept);
	}
}