package com.srm.java.training.inheritance;

class Shape
{
	void printShape()
	{
		System.out.println("This is Shape.");;
	}
}
class Rectangle1 extends Shape
{
	void printRect()
	{
		System.out.println("This is rectangular Shape.");;
	}
}
class Circleclass extends Shape
{
	void printCircle()
	{
		System.out.println("This is Circle Shape.");;
	}
}
class Squareclass extends Rectangle1
{
	void printSquare()
	{
		System.out.println("Square is a rectangle.");;
	}
}
public class Shapeclass {

	public static void main(String[] args) {
		Squareclass s=new Squareclass();
		System.out.println("\nCalling Shape class method");
		s.printShape();
		System.out.println("\nCalling Rectangle class method");
		s.printRect();
	}
}
