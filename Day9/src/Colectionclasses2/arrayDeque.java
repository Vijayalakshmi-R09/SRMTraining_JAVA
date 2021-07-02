package Colectionclasses2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class arrayDeque {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Deque<Integer> dq=new ArrayDeque<Integer>();
		System.out.println("Enter the size of Deque: ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements: ");
		for(int i=0;i<n;i++)
		{
			dq.push(sc.nextInt());	
		}
		System.out.println("ArrayDeque : "+dq);
		System.out.println("Pop Operation: "+dq.pop());
		System.out.println("Peek Operation: "+dq.peek());
		System.out.println("isEmpty: "+dq.isEmpty());
	}
}
