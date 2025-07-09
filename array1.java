class Main
{
	public static void main(String[]args)
	{
		String[] arr=new String[]{"prathyu","varshu","shiv"};
		System.out.println("length is  "+ arr.length);
		System.out.println((arr.length-1));
		for( int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
	}
}