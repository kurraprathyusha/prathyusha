class Main
{
	public static void main(String[]args)
	{
	int[] a=new int[]{10,20,30,40,50,60,70};
	int temp=a[0];
	for(int i=0;i<=a.length-2;i++)
	{
		a[i]=a[i+1];
		System.out.println(a[i]);
		
	}
	System.out.println(a[a.length-1]=temp);

}
}