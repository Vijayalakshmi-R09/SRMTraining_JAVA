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
//	    int min=arr.get(0);
//	    int max=arr.get(0);
//	    for(int i=0;i<n;i++)
//	    {
//	    	if(arr.get(i)>max)
//	    	{
//	    		max=arr.get(i);
//	    	}
//	    	else if(arr.get(i)<min)
//	    	{
//	    		min=arr.get(i);
//	    	}
//	    }
//	    System.out.println("\nMINIMUM in arrayList: "+min);
//	    System.out.println("\nMAXIMUM in arrayList: "+max);
	    System.out.println("\nMINIMUM in arrayList: "+Collections.min(arr));
	    System.out.println("\nMAXIMUM in arrayList: "+Collections.max(arr));
	 }

}
