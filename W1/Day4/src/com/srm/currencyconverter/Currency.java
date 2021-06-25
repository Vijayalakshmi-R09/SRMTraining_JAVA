package com.srm.currencyconverter;

import java.util.Scanner;

public class Currency 
{
	double inr;
	double usd;
	double euro;
	double yen;
	Scanner in=new Scanner(System.in);
	public void dollarToRupee()
	{   System.out.println("DOLLAR TO INR");
	    System.out.println("********************");
		System.out.println("\nEnter value(USD): ");
		usd=in.nextInt();
		inr=usd*67;
		System.out.println("Dollar: "+usd+"equal to INR= "+inr+"\n");
	}
	public void rupeeToDollar()
	{
		System.out.println("INR TO DOLLAR");
		System.out.println("********************");
		System.out.println("\nEnter value(INR): ");
		inr=in.nextInt();
		usd=inr/67;
		System.out.println("Rupee: "+inr+"equal to Dollars: "+usd+"\n");
		}
	public void euroToRupee()
	{
		System.out.println("EURO TO INR");
		System.out.println("********************");
		System.out.println("\nEnter value(EURO): ");
		euro=in.nextInt();
		inr=euro*79.50;
		System.out.println("Euro: "+euro +"equal to INR: "+inr+"\n");
	}
	public void rupeeToEuro()
	{
		System.out.println("INR TO EURO");
		System.out.println("********************");
		System.out.println("\nEnter value(INR): ");
		inr=in.nextInt();
		euro=(inr/79.50);
		System.out.println("Rupee: "+inr +"equal to Euro: "+euro+"\n");
	} 
	
	public void yenToRupee()
	{
		System.out.println("YEN TO INR");
		System.out.println("********************");
		System.out.println("\nEnter value(YEN): ");
		yen=in.nextInt();
		inr=yen*0.61;
		System.out.println("YEN: "+yen +"equal to INR: "+inr+"\n");
	}
	public void rupeeToYen()
	{
		System.out.println("INR TO YEN");
		System.out.println("********************");
		System.out.println("\nEnter value(INR): ");
		inr=in.nextInt();
		yen=(inr/0.61);
		System.out.println("INR: "+inr +"equal to YEN: "+yen+"\n");
	}
}
