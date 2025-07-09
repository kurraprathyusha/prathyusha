class maxEVenROW
{
	public static void main(String args[])
	{
		int a[][]={{1,2,3},{4,5,6,7,8},{2,3,5},{7,8,9,3}};
			int row =0,count1=0;	
		for(int i=0;i<a.length;i++)
		{	int count =0;

			for(int j=0;j<a[i].length;j++)
			{ 
				if(a[i][j] % 2 ==0)
				{
					
					count++;
				}
				
				

			}
			
			if(count >count1)
			{	count1=count;
				row =i;
			
			}		

		}
		for(int j=0;j<a[row].length;j++)
		{
			System.out.println(a[row][j]);

		}
		
		
	}

}