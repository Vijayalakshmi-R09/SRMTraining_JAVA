package javatest;

public class Circle 
{
	private double radius;
	private String colour;
	
	public Circle() {
		super();
		this.colour="red";
		this.radius=1.0;
		System.out.println("Default Constructor");
		System.out.println("********************");
		System.out.println("Radius: "+radius);
		System.out.println("Color: "+colour+"\n");
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
		System.out.println("Parameter Constructor");
		System.out.println("********************");
		System.out.println("Radius of circle: "+radius);
	}
    public double getRadius()
    {
    	double r=radius;
    	return r;
    }
	
    public double getArea()
    {
    	double area=0;
    	return (Math.PI*radius*radius);
    }

	public static void main(String[] args) 
	{
		Circle c=new Circle();
		Circle c1=new Circle(2.0);
		c1.getRadius();
		double rad=c1.getArea();
		System.out.println("The Area of Circle: "+rad);
	}

}
