package javatest;

import java.util.Scanner;

public class ReverseEx {

	 
	public static void main(String[] args)   
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Reversal of Number:");
		System.out.println("**********************");
		System.out.println("Enter the digits:");
		int num=sc.nextInt();
		int  rev = 0;  
		while(num != 0)   
		{  
			int rem = num % 10;  
			rev= rev * 10 + rem;  
			num = num/10;  
		}  
			System.out.println("The reverse of the given number is: " + rev);  
		}   
}
