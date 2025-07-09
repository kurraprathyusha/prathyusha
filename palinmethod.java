class Main
{
	public static void main(String[] args)
	{
		String s=new String("121");//string wont has reverse method 
		StringBuffer sb=new StringBuffer(s);
			sb.reverse();
			//sb.toString();
			if(s.contentEquals(sb))
			{
				System.out.println("palin");
			}
			else
				System.out.println("np");
		
	}
}