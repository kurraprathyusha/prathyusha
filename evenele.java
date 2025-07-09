class Main
{
	public static void main(String[]args)
	{
		int arr[]=new int[]{10,12,11,45,67,98,47};
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2==0 && arr[i]%2==0)
			{
				System.out.println("even in even ele "+arr[i]);//evenindex elen elements
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{	if(i%2==0 && arr[i]%2!=0)
			{
				System.out.println(" index odd ele " +arr[i]);//even index odd elements
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{	if(i%2!=0 && arr[i]%2!=0)
				System.out.println(arr[i]);//odd index odd elements
		}
		for(int i=0;i<=arr.length-1;i++)
		{		if(i%2!=0 && arr[i]%2==0)
				System.out.println("even ele oddindi "+ arr[i]);//even ele odd index
		}
		for (int i=0;i<=arr.length-1;i++)
		{
			if(i==4)
			System.out.println(" 5th element is "+arr[i]);//5th element
		}
	
	
			System.out.println("last ele " +arr[(arr.length-1)]);
	
	}
}