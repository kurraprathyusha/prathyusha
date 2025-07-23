class Staticexamples
{

	int roll;
	String name ;
	String course;
	char gender;
	static String institute;
	
	static void m1()
	{
		System.out.println("Static Method ........");

	}

	public static void main(String args[])
	{
		institute="coding hub";// you can directly assign/acces  vales to static variable using name this are called as class variables(Syntax--> class_name.Var_name /var_name)
		System.out.println(institute);
		Staticexamples obj =new Staticexamples();
		obj.roll=634;
		obj.name="krishna";
		System.out.println(obj.roll);
		System.out.println(obj.name);
		m1();   //static methods can also be called directly or using class name
//------------------------------------------------------------------------
		AnotherClass.distic ="khammam";     // static varibale of another class can be accessed using class name(class_name.var_name)
		System.out.println(AnotherClass.distic);


		

	}


}
class AnotherClass
{

	static String distic;


}