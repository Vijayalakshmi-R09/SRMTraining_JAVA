package javatest;

import java.util.Scanner;

abstract class Area{
	abstract void areaSq(int l);
}

interface Areacal{
	void areaRect(int l,int b);
	void areaCircle(int r);
}
public class AbstrInterface extends Area implements Areacal
{
	
	@Override
	public void areaRect(int l, int b) {
		System.out.println("Implemented methods");
		System.out.println("Area of Rectangle: "+l*b);
	}

	@Override
	public void areaCircle(int r) {
		System.out.println("Area of Circle: "+(Math.PI*r*r));
		
	}

	@Override
	void areaSq(int l) {
		System.out.println("Abstract Method");
		System.out.println("Area of Square: "+l*l);
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side: ");
		int l=sc.nextInt();	
		System.out.println("Enter length: ");
		int l1=sc.nextInt();
		System.out.println("Enter breath: ");
		int l2=sc.nextInt();
		System.out.println("Enter radius: ");
		int r=sc.nextInt();
		AbstrInterface a=new AbstrInterface();
		a.areaSq(l);
		a.areaRect(l1, l2);
		a.areaCircle(r);
			
	}
}
