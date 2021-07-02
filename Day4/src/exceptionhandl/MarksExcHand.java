package exceptionhandl;

import java.util.Scanner;

public class MarksExcHand 
{
	public static void main(String args[]) throws MarksOutOfBoundException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("USER DEFINED EXCEPTION HANDLING");	
		System.out.println("Enter Student No: ");
		int n=sc.nextInt();
		System.out.println("Enter Student Name: ");
		String name=sc.next();
		System.out.println("Enter Student Marks: ");
		int marks=sc.nextInt();
		Student s=new Student(n, name, marks);
	    s.marksValidation();
	}
}
