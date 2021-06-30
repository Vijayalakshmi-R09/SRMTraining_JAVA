package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxMinArrList {

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
	    System.out.println("The ArrayList: "+arr);
	    System.out.println("\nMINIMUM Value: "+Collections.min(arr));
	    System.out.println("\nMAXIMUM Value: "+Collections.max(arr));
	 }
}
