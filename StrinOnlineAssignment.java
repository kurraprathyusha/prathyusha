class StrinOnlineAssignment
{
	public static void main(String args[])
	{
		String s="Hello all good morning",new_s="";
		
		System.out.println("---------------Duplicates Char in String-------------------------");
			
		for(int i=0;i<s.length();i++)
		{	char c=s.charAt(i);
			if(s.indexOf(c)!=s.lastIndexOf(c))
			{
				if(new_s.indexOf(c)==-1)
					new_s=new_s+c;

			}

		}
		System.out.println(new_s);




//----------------------------------------------------------------------------------------------------------------------------------------

		System.out.println("---------Search elemt in String---------------");
		String new_s1="Hello";
	
		System.out.println((new_s1.indexOf('g') ==-1)?"NOT found ":"found");
//---------------------------------------------------------------------------------------------------------------------------------------


		String new_s3="hello all & 2 23";
		System.out.println("Vowels are ");
		for(int i=0;i<new_s3.length();i++)
		{
			char c =new_s3.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.println(c);

			}
		}

//-------------------------------------------------------------------------------------------------------------------------------------
		System.out.println("----------------Print vowels,consonent,digits,spaces,symbols------------");
		int vowels=0,consonent=0,digits=0,spaces=0,symbols=0;

		for(int i=0;i<new_s3.length();i++)
		{	char c=new_s3.charAt(i);

			if(c==' ')
				spaces++;
			else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				vowels++;
			else if(c>= '0' && c<= '9')
				digits++;
			else if((c>='a' && c<='z')||(c>='A' &&c<='Z'))
				consonent++;
			else 
				symbols++;
		}
		System.out.println("Vowels "+vowels);
		System.out.println("consonant "+consonent);
		System.out.println("DIGITS "+digits);
		System.out.println("Symbols "+symbols);
		System.out.println("Spacesc "+spaces);

//---------------------------------------------------------------------------------------------------------------------------------------

		System.out.println("---------------------String palindrome or not ----------------");
			
		String new_s5="hello 1 and 2 # 1";
		String check_Pal="",Digit_pal="";
		for(int i=0;i<new_s5.length();i++)
		{
			char c =new_s5.charAt(i);
			if((c>='a' && c<='z')||(c>='A' && c<='Z'))
			{
				check_Pal=check_Pal+c;
				
			}
			else if(c>='0' && c<='9')
			{
				Digit_pal=Digit_pal+c;
			
			}

		}

		StringBuffer sb = new StringBuffer(check_Pal);
		sb.reverse();
		System.out.println((check_Pal.contentEquals(sb)==true)?"Palindrome":"Not Palindrome");
		System.out.println("-------Sum of Digits OF String ---------");
		System.out.println("NUm is "+Digit_pal);
		int num=Integer.parseInt(Digit_pal);
		int sum =0;
		while(num!=0)
		{	sum=sum+num%10;
			num/=10;

		}
		System.out.println("Sum of Digits in String is "+sum);



		System.out.println("-------------------Check Whather Digits OF String is palindrome OR not------------------");
		System.out.println("NUm is "+Digit_pal);
		StringBuffer sb2 =new StringBuffer(Digit_pal);
		System.out.println((Digit_pal.contentEquals(sb2.reverse())==true)?"Palindrome":"Not Palindrome");





//---------------------------------------------------------------------------------------------------------------------------------------
		System.out.println("--------convert Capital into Small and Small Into Capital----------------");
		String new_s6="HeLLo WoRlD";
		String new_s7="";
		for(int i=0;i<new_s6.length();i++)
		{
			char c =new_s6.charAt(i);
			if(c>='A' && c<='Z')
			{	
				int a=c+32;
				new_s7=new_s7+(char)a;
				
			}
			else
			{
				int a =c-32;
				new_s7=new_s7+(char)a;
				

			}

		}
		System.out.println("Updated String is "+new_s7);


//------------------------------------------------------------------------------------------------------------------------------------


		System.out.println("--------SubString-------------");
		String new_s8="abc";
		for(int start=0;start<=new_s8.length();start++)
		{
			for(int end=start;end<=new_s8.length();end++)
			{
				System.out.println(new_s8.substring(start,end));

			}

		}




//---------------------------------------------------------------------------------------------------------------------------------



		System.out.println("------------------Most repeated char int String ------------------");
		String new_s10 ="hello good morning everyone";
		int max=Integer.MIN_VALUE;
		char arr[] =new_s10.toCharArray();
		int a[] =new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{	int count=1;
			if(a[i]==1)
				continue;
			for(int j=i+1;j<arr.length;j++)
			{	
				if(arr[i]==arr[j])
				{	
					a[j]=1;
					count++;


				}

			}
			a[i]=count;
			if(count>max)
				max=count;

		}
		for(int i =0;i<a.length;i++)
		{
			if(a[i]==max)
				System.out.println(arr[i]);
			
		}
		

		
	}


}