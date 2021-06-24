package com.srm.java.training.inheritance;

class Person
{
	 String name;
	 int age;
	 String phno;
	 String address;
	 double salary;
	
	public void printSalary()
	{
		System.out.println("\nDetails:");
		System.out.println("Employe Name: "+name+"\nEmployee Age: "+age+"\nPhone NUmber: "+phno+" Address: "+address+"\nEmployee Salary: "+salary);
	}
}

class Employees extends Person
{
	String specialization;
	String deptartment;
}

class Manager extends Person
{
	String specialization;
	String deptartment;
}

public class Ex3 {

	public static void main(String[] args) {
		Employees e=new Employees();
		e.name="Zen";
		e.age=24;
		e.phno="8974563210";
		e.address="no89,hy street";
		e.salary=50000.00;
		Manager m=new Manager(); 
		m.name="Zen";
		m.age=24;
		m.phno="8974563210";
		m.address="no89,hy street";
		m.salary=50000.00;
		e.printSalary();
		m.printSalary();
	}
}
