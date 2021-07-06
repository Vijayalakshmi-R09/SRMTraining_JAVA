package stringhandling;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);   
        System.out.println("Enter size: ");
        int n=sc.nextInt();
		String[] sarr=new String[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++) 
		{
			sarr[i]=sc.next();
		}
		System.out.println("The String Array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(sarr[i]);
			System.out.print(",");
		}
		for(int i=0;i<n;i++)
		{
		   StringBuffer sb = new StringBuffer(sarr[i].toLowerCase());
	       String str = sb.reverse().toString();
	       if(sarr[i].equals(str))
	       {
	          System.out.println(str + " string is palindrome.");
	        }
	       else
	       {
	         System.out.println(str + " string is not palindrome.");
	       }
		}
	}  
}  