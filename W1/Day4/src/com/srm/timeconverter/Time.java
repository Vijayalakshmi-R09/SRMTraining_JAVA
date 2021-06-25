package com.srm.timeconverter;

import java.util.Scanner;

public class Time 
{
	int hours;
	int seconds;
	int minutes;
	int input;
	Scanner sc = new Scanner(System.in);
	public void secondstohours()
	{	
		System.out.println("SECONDS TO HOURS");
	    System.out.println("********************");
		System.out.print("Enter the number(in seconds): ");
		input = sc.nextInt(); 
		hours = input / 3600;
		minutes = (input % 3600) / 60;
		seconds = (input % 3600) % 60;
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds+"\n");
		
	}
	public void hourstoseconds()
	{
		System.out.println("HOURS TO SECONDS");
	    System.out.println("********************");
		System.out.print("Enter the number(in hrs): ");
		hours=sc.nextInt();
		seconds=(hours*3600);
		//System.out.println("Hours: " + hours);
		System.out.println("Seconds: " + seconds+"\n");
	}
	public void minutestohours()
	{
		System.out.println("MINUTES TO HOURS");
	    System.out.println("********************");
		System.out.print("Enter the number(in mins): ");
		minutes=sc.nextInt();
		hours=minutes/60;
		minutes=minutes%60;
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes+"\n");
	}
	public void hourstominutes()
	{
		System.out.println("HOURS TO MINUTES");
	    System.out.println("********************");
		System.out.print("Enter the number(in hrs): ");
		hours=sc.nextInt();
		minutes=(hours*60);
		System.out.println("Minutes: " + minutes+"\n");
	}	
}