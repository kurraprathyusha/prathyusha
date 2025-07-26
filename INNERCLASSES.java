//---------------------------------------------------------------------------------NON STATIC INNER CLASS----------------------------------------------------------------------------------

/*import java.util.*;//package collection.pacakge1;

 class Threee{
	private void m2()
	{
		System.out.println("welcome");
	}
	
	public static void main(String[] args) {
	
			System.out.println("hi");
			Threee t=new Threee();
			A n=t.new A();
			n.m1();
	}
	class A
	{
		int a;
		public void m1()//non static
		{
			int a=10;
			System.out.println("hello");
			Threee .this.m2();
	
		}
	}

}*/
//save same as Threee.java nd run by java Threer 
//----------------------------------------------------------------------STATIC INNER CLASSS---------------------------------------------------------------------------------------------
import java.util.*;
public class Fourr {
	public void m3()
	{
			System.out.println("aaa");
	}

	public static void main(String[] args) {
		In.m1();
		In i=new In();
		System.out.println(i.a);
	}
	static class In{//static inner classs
		int a=20;
		public static void m1()
		{
			System.out.println("hi");
			Fourr f=new  Fourr();
			f.m3();
			
		}
		
	}

}
//------------------------------------------------------------------------------------------------local class------------------------------------------------------------------------------

/*import java.util.*;
class Fivee {
	static int  v=90;
	public void m3()
	{
			System.out.println("outer");
	}

	public static void main(String[] args) {
		class In{
			public  void m1()
			{
				System.out.println("local class");
				System.out.println(v);
			}
		}
		In i=new In();
		i.m1();
		Fivee f=new Fivee();
		f.m3();
		
		
	}

}*/
//local saved as vth Fiveee nd runed as Fivee









































