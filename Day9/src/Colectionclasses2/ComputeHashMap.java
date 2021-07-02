package Colectionclasses2;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ComputeHashMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		System.out.println("Enter the size of map: ");
		int n=in.nextInt();
		for (int i = 0; i < n; i++) 
		{
			System.out.println("Enter Key: ");
            Integer a = in.nextInt();
            System.out.println("Enter Value: ");
            String b = in.next();
            hmap.put(a, b);
		}
		System.out.println("HashMap : "+hmap);
		System.out.println("The largest Key in HashMap: "+Collections.max(hmap.keySet()));
		System.out.println("The Smallest value in HashMap: "+Collections.min(hmap.values()));	
	}
}
