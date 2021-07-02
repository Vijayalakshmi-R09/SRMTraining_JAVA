package treemap.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AlgoCollections {

	public static void main(String[] args) {
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of ArrayList: ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements: ");
	    for(int i=0;i<n;i++)
	    { 
	    	arrlist.add(sc.nextInt());
	    }
	    System.out.println("The ArrayList: "+arrlist);
	    Collections.reverse(arrlist);
	    System.out.println("Reversed ArrayList: "+arrlist);
	    Collections.shuffle(arrlist);
	    System.out.println("Shuffled ArrayList: "+arrlist);
	    System.out.println("Maximum Element: "+Collections.max(arrlist));
	    System.out.println("Minimum Element: "+Collections.min(arrlist));
	    System.out.println("Enter a element to Perform Binary Search: ");
	    int num=sc.nextInt();
	    System.out.println("Output: "+Collections.binarySearch(arrlist,num));//if element not present na it will return(-(insertion position)-1)
	}
}
