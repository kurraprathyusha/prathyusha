class Main
{
	public static void main(String[]args)
	{
		int[]a=new int[]{10,20,30,40,50,60,70,80,0};
		int search=50;
		Sample s=new Sample();
		int index=s.present(a,search);//3
		System.out.println(" index num = "+index);
		if(index>=0)
		{
			int[] deletion=s.deletion(a,index);
			for(int temp:deletion)
				System.out.println(temp);
		}
		else
		{
			int[] insertion=s.insertion(a,search);	
			for(int temp1:insertion)
			System.out.println(temp1);
		}
			
			
	}
}
class Sample
{
	int present(int[] a, int search)
	{
		for(int i=0;i<=a.length-1;i++)
		{
			if(search==a[i])
			{
				return i;
			}
		}
			return -1;
	}
	int[] deletion(int[]a,int index)
	{
		for(int x= index;x<=a.length-2;x++)
		{
			a[x]=a[x+1];
		}
			a[a.length-1]=0;
			return a;
	 }
	int[] insertion(int a[],int search)
	{
		int id=3;
		for(int j=a.length-1;j>=id+1;j--)	
		{
			a[j]=a[j-1];
		}
		a[id]=search;
		return a;
	}
 
}
