package legacyclasses;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableprg {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(1,"Remo");
		ht.put(2,"Suney");
		ht.put(3,"Stepen");
		ht.put(4, "Evelyn");
		ht.put(5, "Anna");
		System.out.println("HashTable...");
		for(Entry<Integer, String> e:ht.entrySet())
		{
			System.out.println(e.getKey()+" : "+e.getValue());
		}	 
	    ht.remove(102);  
	    System.out.println("\nAfter remove operation: \n"+ ht);  
	    System.out.println("\nUsing getOrDefault method");
	    System.out.println("Value: "+ht.getOrDefault(1, "Key Not Found"));  //if key 1 found it will return its value,else it print Not found
	    ht.putIfAbsent(6,"Ginny");  
	    System.out.println("\nUpdated HashTable: "+ht); 
	    ht.put(4,"Sin");
	    System.out.println("\nUpdated HashTable: "+ht); 
	    
	}
}
