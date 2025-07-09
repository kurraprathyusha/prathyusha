import java .util.Scanner;
class Main
{	
	public static void main (String args[])
	{	
		Scanner sc=new Scanner(System.in);
		Sample sam=new Sample();
		sam.name=sc.next();
		 sam.eid=sc.nextInt();
		 sam.salary=sc.nextInt();
		sam. r=sam.salary*12;
		System.out.println("annual salary is "+sam.r);
		int r1=sam.pf(sam.salary);
		int r2=sam.tax(sam.r);
		int r3=sam.homeallowance(sam.salary,r1);
		System.out.println( "remaning amount is "+r3);
		
	}
}
class Sample
{
	int eid,salary,r;
	String name,email,dept;
	//int pf,n;
	
	int pf(int salary)
	{
		int pf=(int)(salary*(10/100.0));
		System.out.println("pf is "+ pf);
		return pf;
	}
	int tax(int r)
	{
		int n=(r==500000)?(int)(r*(15/100.0)):
				(r==1000000)?(int)(r*(10/100.0)):
				(r==1500000)?(int)(r*(15/100.0)):
				(r==3000000)?(int)(r*(20/100.0)):
				(int)(r*(35/100.0));
			System.out.println( "tax = "+n);
			return n;
	}
	int homeallowance(int salary,int r1)
	{
		int basicneeds=(int)(salary*(30/100.0));
			System.out.println("basicneeds= " +basicneeds);
		int luxury=(int)(salary*(5/100.0));
			System.out.println(  "luxury= "+luxury);
		int emi=(int)(salary*(10/100.0));
			System.out.println(" emi= "+emi);
		int orphans=(int)(salary*(5/100.0));
			System.out.println( "orphans = "+orphans);
		int remingamount=r1-basicneeds-luxury-emi-orphans;
			System.out.println(remingamount);
		return remingamount;
	}
	
	


}