package com.srm.java.training.inheritance;

	class Rectangle{
		int length;
		int breadth;
		public Rectangle(int length, int breadth)
		{
			this.length=length;
			this.breadth=breadth;
			
		}
		void printarea()
		{
			System.out.println("Area"+length*breadth);
		}
		void printperimeter()
		{
			System.out.println("Perimeter "+2*(length+breadth));
		}
	}
	class square extends Rectangle
	{
		
		square(int side)
		{
			super(side,side);
		}
		
	}
	public class RectangleClass {
		public static void main(String args[])
		{
			Rectangle rect=new Rectangle(10,20);
			square s=new square(10);
			System.out.println("Area of SQUARE:");
			System.out.println("*************************");
			s.printarea();
			s.printperimeter();
			System.out.println("\nArea of RECTANGLE:");
			System.out.println("*************************");
			rect.printarea();
			rect.printperimeter();
		}
	}
