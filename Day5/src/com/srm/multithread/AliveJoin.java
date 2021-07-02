package com.srm.multithread;

import java.util.Scanner;

public class AliveJoin extends Thread{
	int n;
	int cubic;
	
	
	public AliveJoin(int n) {
		super();
		this.n = n;
	}
	 public void run()
	 {
	        try {
	        	cubic=n*n*n;
				System.out.println("\nCube Root of "+n+" : "+cubic);
	            Thread.sleep(300);
	            
	        }
	        catch (InterruptedException ie) {
	        }
	    }  

	  public static void main(String[] args)
	    {
		  //Scanner sc=new Scanner(System.in);
		  System.out.println("isAlive and join Program: ");
		  System.out.println("*********************************");
		  //System.out.println("Enter the value: ");
		  //int n=sc.nextInt();
		
		  AliveJoin t1 = new AliveJoin(10);
		  AliveJoin t2 = new AliveJoin(5);
		  AliveJoin t3=new AliveJoin(3);
	      t1.start();
	      t3.start();
	      System.out.println("Is Thread1 running: "+t1.isAlive());
	      System.out.println("Is Thread2 running: "+t2.isAlive());
	      System.out.println("IsThread3 running: "+t3.isAlive());
	      
	        try {
	            t1.join(); 
	        }
	        catch (InterruptedException ie) {
	        	System.out.println(ie);
	        }
	        t2.start();  
	        System.out.println("Thread2 running: "+t2.isAlive());
	    }
	}
