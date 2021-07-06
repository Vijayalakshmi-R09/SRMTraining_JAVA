package stringhandling;

import java.util.Scanner;

public class SubsetStr {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to find subsets: "); 
        String str;
        str=sc.next();
        int l = str.length();  
        int temp = 0;  
        String arr[] = new String[l*(l+1)/2];  
        for(int i = 0; i < l; i++) 
        {  
            for(int j = i; j < l; j++) 
            {  
                arr[temp] = str.substring(i, j+1);  
                temp++;  
            }  
        }  
        System.out.println("Subsets of String "+str+ " is: ");  
        for(int i = 0; i < arr.length; i++) 
        {  
            System.out.println(arr[i]);  
        }
	}
}
