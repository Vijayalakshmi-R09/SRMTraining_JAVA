package legacyrevision;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetobj {

	public static void main(String[] args)
	{
		HashSet<ArrayList> hs=new HashSet<ArrayList>();
		
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Lenin");
		arr1.add("Macellenaous");
		arr1.add("Malfoy");
		System.out.println("\nString ArrayLists: ");
		System.out.println("-------------------------------");
		for(String i:arr1) {
			System.out.println(i);
		}
		ArrayList<MyOwnClass> arr2=new ArrayList<MyOwnClass>();
		arr2.add(new MyOwnClass("Derek",24));
		arr2.add(new MyOwnClass("Jack",25));
		arr2.add(new MyOwnClass("Deny",23));
		System.out.println("\nMyOwnClass ArrayList: ");
		System.out.println("-------------------------------");
		for(MyOwnClass i:arr2) {
			System.out.println(i);
		}
		ArrayList<Integer> arr3=new ArrayList<Integer>();
		arr3.add(5);
		arr3.add(6);
		arr3.add(4);
		arr3.add(2);
		arr3.add(1);
		System.out.println("\nInteger ArrayList: ");
		System.out.println("-------------------------------");
		for(Integer i:arr3) {
			System.out.println(i);
		}
		hs.add(arr1);
        hs.add(arr2);
        hs.add(arr3);
        
        Iterator itr = hs.iterator();
        System.out.println("\nHashSet Values..");
        while (itr.hasNext())
            System.out.print(itr.next() + ", ");
        System.out.println();
	}
