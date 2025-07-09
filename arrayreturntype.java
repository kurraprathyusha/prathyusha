class Main
{
	public static void main(String[]args)
	{
		double[] arr=new double []{10.5,4,5.4,6};//double[]copy=arr.clone//copies it to copy 
		Sample sam=new Sample();
		double[] result=sam.m1(arr);//passing address
		System.out.println(result);//printing address
		for(int i=0;i<=result.length-1;i++)//to retive elements we need to use for or foreach loop	
		{
			System.out.println(result[i]);
		} 
		//for (double temp:arr)
		//	System.out.println(temp);
		
	}
}
class Sample
{
	double[] m1(double[]arr)//takes address and obtain corresending elem
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=	Math.pow(arr[i],2);
		}
			return arr;//return adress
	}
}