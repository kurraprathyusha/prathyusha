class Main
{
	public static void main(String[]args)
{
	String branch="ECE",a="0",a1="0",a3="0",a4="0",a5="0";
	int fee=0,sc=0,totalfee=0;
	if(branch=="ECE")
	{
		 a="control systems";a1="mcmp";a3="vlsi";a4="dcn";a5="dsp";
		 fee=60000;
		 sc=15000;
	}
	else if(branch=="EEE")
	{
		a="maths";a1="mpmc";a3="dcn";a4="pps";a5="imp";
		fee=50000;sc=10000;
	}
	else if(branch=="MECH")
	{
		a="ml";a1="tools";a3="m2";a4="pps";a5="drawing";
		fee=80000;sc=5000;
	}
	else if(branch=="CIVIL")
	{
		a="maths";a1="rs";a3="sps";a4="pps";a5="et";
		fee=40000;sc=10000;
	}
	totalfee=fee-sc;
	System.out.print("branch: ");
	System.out.println(branch);
	System.out.print("subjects: ");
	System.out.println(a);
	System.out.println(a1);
	System.out.println(a3);
	System.out.println(a4);
	System.out.println(a5);

	System.out.println(totalfee);
}
}

	



	