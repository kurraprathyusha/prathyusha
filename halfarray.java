class Main
{
	public static void main(String[]args)
	{
		int[]arr=new int[]{10,20,30,40,50};
		for(int i=((arr.length-1)/2);i>=0;i--)
		{
			System.out.println(arr[i] +"first half");
		}
		for(int i=(((arr.length-1)/2)+1);i<=arr.length-1;i++)
		{
			System.out.println( " second half  " +arr[i]);	
	
		}
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  