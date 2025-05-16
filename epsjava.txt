class Main{
	public static void main(String []args){
	int n=36;
	int d=(int)Math.sqrt(n);
	switch((d*d==n && n%2==0)?1:0){
	 case 1:
	   System.out.println("yes");
	break;
	default:
	   System.out.println("no");
}
}
}
	