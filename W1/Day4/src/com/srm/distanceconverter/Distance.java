package com.srm.distanceconverter;

import java.util.Scanner;

public class Distance 
{
	double km;
	double m;
	double miles;
	Scanner sc = new Scanner(System.in);
	public void kmTom()
	{
		System.out.println("KM TO Metre");
	    System.out.println("********************");
		System.out.println("\nEnter value(in km): ");
		km=sc.nextDouble();
		m=(km*1000);
		System.out.println(km+" km" +"equal to "+m+" metres"+"\n");
	}
	public void mTokm()
	{
		System.out.println("Metre TO KM");
	    System.out.println("********************");
		System.out.println("\nEnter value(in m): ");
		m=sc.nextDouble();
		km=(m/1000);
		System.out.println(m+" m" +" equal to "+km+" kilometres"+"\n");
	}
	public void milesTokm()
	{
		System.out.println("MILES TO KM");
	    System.out.println("********************");
		System.out.println("\nEnter value(in miles): ");
		miles=sc.nextDouble();
		km=(miles*1.60934);
		System.out.println(miles+" miles" +"equal to "+km+" kilometres"+"\n");
		}
	public void kmTomiles()
	{
		System.out.println("KM TO MILES ");
	    System.out.println("********************");
		System.out.println("\nEnter value(in km): ");
		km=sc.nextDouble();
		miles=(km*0.621371);
		System.out.println(km+" km" +"equal to "+miles+" miles"+"\n");
	}
}
