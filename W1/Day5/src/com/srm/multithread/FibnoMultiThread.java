package com.srm.multithread;

import java.util.Scanner;

public class FibnoMultiThread extends Thread
{
	
	     int n;
		public FibnoMultiThread(int n)
		{
		super();
		this.n = n;
	     }
		public void run() 
		{
		
			try 
				{
				    int a=0, b=1, c=0;
				    System.out.println("Fibonacci series:");
		               while (n>0)
		               {
		            	   
		                    System.out.print(c+"\n");
		                    a=b;
		                    b=c;
		                    c=a+b;
		                    n=n-1;
		               }
		               System.out.println();
		          }
					
			  catch (Exception ex)
	          {
	               System.out.println(ex);
	          }
		  
		}
	public static void main(String[] args) 
	{
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Fibonacci Series using MutliThreading...");
		
		System.out.println("Enter Value: ");
		int n=sc.nextInt();
		FibnoMultiThread f1=new FibnoMultiThread(n);
		FibnoMultiThread f2=new FibnoMultiThread(8);
	    f1.start();
		f1.sleep(1000);
		f2.start();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
