package com.srm.java.training.inheritance;

class FountainPen extends Pen
{
@Override
void write() {
	System.out.println("Write using Fountian Pen.");
}

@Override
void refill() {
	System.out.println("Refill ink in Fountian Pen.");
}
void changeNib()
{
	System.out.println("Please change the nib of pen to experience smooth writing. ");
}
}

public class AbstractPenEx {

	public static void main(String[] args) {
		FountainPen p1=new FountainPen();
		p1.write();
		p1.refill();
		p1.changeNib();
	}
}


