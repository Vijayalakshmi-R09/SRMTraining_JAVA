package legacyclasses;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearcgSortArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int n=sc.nextInt();
		double[] darr=new double[n];
		System.out.println("Enter Double array elements: ");
		for(int i=0;i<n;i++) 
		{
			darr[i]=sc.nextDouble();
		}
		System.out.println("\nArray: ");
		for(int i=0;i<n;i++) {
			System.out.println(darr[i]);
		}
		Arrays.sort(darr);
		System.out.println("Sorted Array:\n**********");
		for(int i=0;i<n;i++) {
			System.out.println(darr[i]);
		}
		System.out.println("Enter the element to perform Binary Search: ");
	    double s1=sc.nextDouble();
		System.out.println("Search By BINARYSEARCH(): \n********************************\n");
        System.out.println(s1 + " Key Value = "+Arrays.binarySearch(darr,s1));                
	}

}
