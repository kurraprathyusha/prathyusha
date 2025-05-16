class Main {
    public static void main(String[] args) 
    {
        System.out.println("                  BABAI HOTEL              ");
        System.out.println("                  RESTAURANT");
        System.out.println("***************************************************");
        System.out.println("Opposite Navodaya Vidyalay, Gachibowli Road,502032");
        System.out.println("        TEL:0969764575");
        System.out.println("      EMAIL:Babaihotel@gmail.com");
        System.out.println("--------------------INVOICE-----------------------");
        System.out.print("Ticket No:1740");
        System.out.println("                    DATE:09-MAY-2025");
        System.out.print("Table No:5");
        System.out.println("                          Time:9:12 PM");
        System.out.println("--------------------------------------------------");
        System.out.println("ITEMS                          QTY  PRICE  TOTAL "  );
        System.out.println("--------------------------------------------------");
        String item1="CHICKEN LOLLIPOP",item2="chicken soup",item3="GARLIC NAAN",item4="MUTOON BIRYANI",item5="COKE",item6="APRICON DELIGHT";
        int quantity=1;
        double item1price=150,item2price=150,item3price=120,item4price=500,item5price=80,item6price=120,a=quantity*item1price,b=quantity*item2price,c=quantity*item3price,d=quantity*item4price,e=quantity*item5price,f=quantity*item6price;
        double total=a+b+c+d+e+f,cgst =(2/100)*total,sgst=(1/100)*total,dis=0, disc=0,t1=0;
	String offer="copun",pm="paytm";
	if(offer=="copun")
	{
		dis=(20.0/100)*total;
	}
	else
	{
		dis=(15.0/100)*total;
	}
	if(pm=="cash")
	{
		disc=(1.5/100)*total;
	}
	
	else if (pm=="gpay")
	{
		disc=(2.0/100)*total;
	}
	else if(pm=="credit card")
	{
		disc=(2.5/100)*total;
	}
	else if(pm=="paytm")
	{
		disc=(3.0/100)*total;
	}
	else
	{
		disc=(0.0/100)*total;
	}
		t1=total-dis;
        System.out.print( item1);
        System.out.print( "                ");
        System.out.print( quantity);
        System.out.print( "   ");
        System.out.print( item1price);
        System.out.print( "   ");
        System.out.println( a);
         System.out.print( item2);
        System.out.print( "                    ");
        System.out.print( quantity);
        System.out.print( "   ");
        System.out.print( item2price);
        System.out.print( "   ");
        System.out.println( b);
         System.out.print( item3);
        System.out.print( "                     ");
        System.out.print( quantity);
        System.out.print( "   ");
        System.out.print( item3price);
        System.out.print( "   ");
        System.out.println( c);
         System.out.print( item4);
        System.out.print( "                  ");
        System.out.print( quantity);
        System.out.print( "   ");
        System.out.print( item4price);
        System.out.print( "   ");
        System.out.println( d);
         System.out.print( item5);
        System.out.print( "                            ");
        System.out.print( quantity);
        System.out.print( "    ");
        System.out.print( item5price);
        System.out.print( "    ");
        System.out.println( e);
         System.out.print( item6);
        System.out.print( "                 ");
        System.out.print( quantity);
        System.out.print( "   ");
        System.out.print( item6price);
        System.out.print( "   ");
        System.out.println(f);
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
	System.out.print("discount:");
	System.out.print("			    ");
	System.out.println(dis);
	System.out.print("pm discount:");
	System.out.print("		           ");
	System.out.println(disc); 

        System.out.print("TOTAL:");
        System.out.print("                          ");
        System.out.print("$   ");
        System.out.println(t1);
        System.out.println("****************************************************");
        System.out.println("         *THANK YOU FOR DINING WITH US!*");
        System.out.println("          *WE HAVE FREE HOME DELIVERY! *");
        System.out.println("***************************************************");
}
}