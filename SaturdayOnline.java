//21-06-2025

import java.util.*;
class SaturdayOnline {
    public static void main(String args[]) {
        String s = "Hello";
        String s1 = "";
	        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                s1 = s1 + " " + s.substring(i, j);
                System.out.println(s.substring(i, j));
            }
        }

        System.out.println(s1);
System.out.println("-------------------------------print subString without vowels in string--------------------------");
        String arr[] = s1.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String new_s = arr[i];
            boolean b = true;
	
            for (int j = 0; j < new_s.length(); j++) {
                char c = new_s.charAt(j);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
		 {
                    b = false;
                    break;
                }
            }

            if (b) {
                System.out.println( new_s);
            }
        }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// word with max vowels 
		
	String new_s2="Hello everyone good morning";

	String new_arr[] =new_s2.split(" ");
	int vowel_max=0;String word="";
	for(int i=0;i<new_arr.length;i++)
	{	int vowels=0;
		String new_s3=new_arr[i];
		for(int j=0;j<new_s3.length();j++)
		{	
			char c = new_s3.charAt(j);
                 	if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
		 	{
                   		vowels++;
               		 }		
			
		}
		if(vowels>vowel_max)
		{
			vowel_max=vowels;
			word=new_s3;
		}		

	}
	System.out.println("Max vowel word is :"+word);


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 	System.out.println("--------------Updated first char of word to capital----------------------");
	String new_s4="";
	for(int i=0;i<new_s2.length();i++)
	{

		char c=new_s2.charAt(i);
		if(i==0)
		{

			new_s4=new_s4+" "+Character.toUpperCase(c);
		}
		else if(c==' ' && new_s2.charAt(i+1) !=' ')
		{
			new_s4=new_s4+" "+Character.toUpperCase(new_s2.charAt(i+1));
			i++;
	
		}
		else
		{

			new_s4=new_s4+c;
		}

	}
	System.out.println(new_s4);

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	System.out.println("--------------given String anagram or not ----------------------");

	String new_s5="listen",new_s6="silent";
	char c_arr1[]=new_s5.toCharArray();
	char c_arr2[]=new_s6.toCharArray();
	
	Arrays.sort(c_arr1);
	Arrays.sort(c_arr2);
	System.out.println(Arrays.toString(c_arr1));
	System.out.println(Arrays.toString(c_arr2));
	boolean b=true;
	if(new_s5.length()==new_s6.length())
	{

		for(int i=0;i<c_arr1.length;i++)
		{
			if(c_arr1[i]!=c_arr2[i])
			{
				b=false;
				System.out.println("NOT anagram");
				break;
				
			}

		}
		if(b)
			System.out.println("anagram");
	

	}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
	System.out.println("-----------------print char based on follow digit-----------------------------");
	
	//NOT Better approach I think if found one i will update it mean time it works fine 

	String new_pro="a1b2c3d8";
	for(int i=0;i<new_pro.length();i++)
	{
		char c =new_pro.charAt(i);
		if(Character.isDigit(c))
		{	char letter =new_pro.charAt(i-1);
			for(int j=1;j<=Character.getNumericValue(c);j++)
			{
								
				System.out.print(letter);
			}

		}
		else
		{

			continue;
		}

	}
	




    }
}
