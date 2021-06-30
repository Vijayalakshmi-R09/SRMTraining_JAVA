package collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SumOfNumbersTreeSet {

	public static void usingFor(TreeSet<Integer> i)
	{
		int fsum=0;
		for(int v:i)
	    {
	    	fsum+=v;
	    }
	    System.out.println("\nUSING FOR LOOP");
	    System.out.println("**********************");
	    System.out.println("Sum Of Numbers: "+fsum);
	}
	
	public static void usingWhile(TreeSet<Integer> i)
	{
		int wsum=0;
		Iterator<Integer> itr = i.iterator();
		while(itr.hasNext())
	    {
	    	wsum+=itr.next();
	    }
		 System.out.println("\nUSING WHILE LOOP");
		 System.out.println("**********************");
		 System.out.println("Sum Of Numbers: "+wsum);
	}
	
	public static Integer usingRecursion(Integer r)
	{ 
		if (r <= 1)
		{
			return r;
		}
		return r + usingRecursion(r - 1);	
	}
	
	public static void main(String[] args) 
	{
		
		TreeSet<Integer> tset=new TreeSet<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of TreeSet: ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements: ");
	    for(int i=0;i<n;i++)
	    { 
	    	tset.add(sc.nextInt());
	    }
	    System.out.println("TreeSet: "+tset);
	    usingFor(tset);
	    usingWhile(tset);
	    System.out.println("\nUSING RECURSION");
		System.out.println("**********************");
		System.out.println("Sum of Numbers :");
	    for (Integer i : tset) 
	    {
	    	System.out.println(usingRecursion(i));
	    }
	}
}
