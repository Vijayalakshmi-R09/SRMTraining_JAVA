package Colectionclasses2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ExIterator {

	public static void main(String[] args) 
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of ArrayList: ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements: ");
	    for(int i=0;i<n;i++)
	    { 
	    	arr.add(sc.nextInt());
	    }
	    System.out.println("The ArrayList elements: ");
	    System.out.println("Using Iterator.......");
	    Iterator<Integer> itr= arr.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    System.out.println("Using ListIterator.......");
	    ListIterator<Integer> litr=arr.listIterator();//notes:list iterator is bi-directional
	    System.out.println("Forward Iteration");
	    while(litr.hasNext())
	    {
	    	System.out.println(litr.next());
	    }
	    System.out.println("Backward Iteration");
	    while(litr.hasPrevious())
	    {
	    	System.out.println(litr.previous());
	    }
	}

}
