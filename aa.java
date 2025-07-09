class Main
{
	public static void main(String[]args)
	{
		double[] arr=new double []{10.5,4,5.4,6};
		Sample sam=new Sample();
		double[] result=sam.m1(arr);
		System.out.println(result);
		for(int i=0;i<=result.length-1;i++)	
		{
			System.out.println(result[i]);
		} 
		//for (double temp:arr)
		//	System.out.println(temp);
		
	}
}
class Sample
{
	double[] m1(double[]arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=	Math.pow(arr[i],2);
		}
			return arr;
	}
}