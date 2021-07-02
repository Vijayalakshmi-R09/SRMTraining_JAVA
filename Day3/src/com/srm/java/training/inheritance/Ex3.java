package com.srm.java.training.inheritance;

import java.util.Scanner;

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
		Scanner sc=new Scanner(System.in);
		Employees e=new Employees();
		System.out.println("Enter Employee details:");
		System.out.println("Name: ");
		e.name=sc.next();
		System.out.println("Age: ");
		e.age=sc.nextInt();
		System.out.println("PH.no: ");
		e.phno=sc.next();
		System.out.println("Adress: ");
		e.address=sc.next();
		System.out.println("Salary: ");
		e.salary=sc.nextDouble();
		Manager m=new Manager(); 
		System.out.println("\nEnter Manager details:");
		System.out.println("Name: ");
		m.name=sc.next();
		System.out.println("Age: ");
		m.age=sc.nextInt();
		System.out.println("PH.no: ");
		m.phno=sc.next();
		System.out.println("Adress: ");
		m.address=sc.next();
		System.out.println("Salary: ");
		m.salary=sc.nextDouble();
		e.printSalary();
		m.printSalary();
	}
}
