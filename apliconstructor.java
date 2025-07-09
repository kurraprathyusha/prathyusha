class Main
{
	public static void main(String[]args)
	{
		Student s=new Student();
		double total=s.total(10,20,30);
		double perc=s.perc(total);
		System.out.println(s.print());		
	}
}
class Student
{
	int roll;
	String name;
	double total,m1,m2,m3,perc;
	Student()
	{
		this.roll=414;
		this.name="var";
		this.m1=11;
		this.m2=21;
		this.m3=31;
	}	
	/*student(double m1,double m2,double m3)
	{
		this.m1=m1;

	}*/
	double total (double m1,double m2,double m3)	
	{
		total=m1+m2+m3;
		return total;
	}
	 double perc(double total) 
	{
		perc=(total/300)*100;
		return perc;
	}
	String print()
	{
		return name + " " + roll+ " " +total+perc;
	}

	
	
}
