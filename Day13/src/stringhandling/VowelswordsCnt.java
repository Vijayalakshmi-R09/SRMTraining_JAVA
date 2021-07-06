package stringhandling;

import java.util.Scanner;

public class VowelswordsCnt {

	static void vowelCount(String str) 
	{
		int vcount=0;
		for(int i = 0; i < str.length(); i++) 
        {  
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
            {  
                vcount++;  
            }  
        }
        System.out.println("Vowels Count: "+vcount);
	}
	
	static void wordCount(String s)
	{
		String[] st=s.split("\\s");
		int wcount=st.length;
		System.out.println("Word Count: "+wcount);
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the string");
		String str=sc.nextLine();
        str = str.toLowerCase();  
        vowelCount(str);
        wordCount(str);
	}
}

