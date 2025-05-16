class Main
{
	public static void main(String []args)
{
	int cost=500,sp=400;
	String r=(sp>cost)?"PROFIT":(sp<cost)?"LOSS":"NOR PROFIT NOR LOSS";
	System.out.println(r);
}
}