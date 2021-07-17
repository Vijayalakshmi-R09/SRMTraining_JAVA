package javatest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValid {
	static void validPattern(String s,String input)
	{
		Pattern pattern = Pattern.compile(s);  
        Matcher matcher = pattern.matcher(input);  
        System.out.println("Pattern match: "+ matcher.matches()+"\n");  
	}

	public static void main(String[] args)
	{
		System.out.println("Email Pattern Validation: \n");
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine())  
		{  
			try {
		
			String s=sc.nextLine();  
			System.out.println("Email ID-> "+s);
	        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
	        validPattern(regex,s); 
			}
			catch(Exception e){
				System.out.println(e);
			}	    
		}  
    } 
}
