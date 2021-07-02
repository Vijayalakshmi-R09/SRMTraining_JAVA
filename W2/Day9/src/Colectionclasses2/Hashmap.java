package Colectionclasses2;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		System.out.println("Enter the size of map: ");
		int n=in.nextInt();
		for (int i = 0; i < n; i++) 
		{
            Integer a = in.nextInt();
            String b = in.next();
            hmap.put(a, b);
		}
		System.out.println("HashMap : "+hmap);
		System.out.println("HashMap contains value 'Ajay': "+hmap.containsValue("Ajay"));
		System.out.println("HashMap conatins key '2': "+hmap.containsKey(2));
		System.out.println("Retrive Specified element: "+hmap.get(3));
		hmap.remove(1);
		System.out.println("After Removal Key'1': "+hmap);
	}
}
