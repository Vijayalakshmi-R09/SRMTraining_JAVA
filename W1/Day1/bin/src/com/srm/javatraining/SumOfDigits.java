package com.srm.javatraining;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int d , sum = 0;   
		while(n > 0)  
		{  
		  d = n % 10;  
		  sum = sum + d;  
		  n = n/ 10;  
		}  
		System.out.println("Sum of Digits: "+sum);  			 
		}
	}

