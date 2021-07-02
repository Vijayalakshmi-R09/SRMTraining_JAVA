package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class ConcatLinkList {

	public static void main(String[] args) 
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		LinkedList<Integer> list2=new LinkedList<Integer>();
		LinkedList<Integer> list3=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of LinkedList1: ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements: ");
	    for(int i=0;i<n;i++)
	    { 
	    	list1.add(sc.nextInt());
	    }
	    System.out.println("LinkedList1: "+list1);
		System.out.println("Enter the Size of LinkedList2: ");
		int n1=sc.nextInt();
		System.out.println("Enter the Elements: ");
	    for(int i=0;i<n1;i++)
	    { 
	    	list2.add(sc.nextInt());
	    }
	    System.out.println("LinkedList2: "+list2);
	    list3.addAll(list1);
	    list3.addAll(list2);
	    System.out.println("Concatenation of List1 & List2: "+list3);
	}

}
