package legacyrevision;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesClassEx {

	public static void main(String[] args) 
	{
		try {
		String s=System.getProperty("java.specification.version");
		System.out.println("Value of key:java.specification.version: " +s);
		System.out.println("\nSystem Properties:");
		Properties p=System.getProperties();
		Properties p1=new Properties();     
		System.out.println();
	    Set set=p.entrySet();  
		Iterator itr=set.iterator();  
		while(itr.hasNext())
		{  
			Map.Entry entry=(Map.Entry)itr.next();  
			System.out.println(entry.getKey()+" = "+entry.getValue());  
		}    
		p1.setProperty("Name","Vijayalakshmi R");  
		p1.setProperty("Designation","Trainee");  
		p1.store(new FileWriter("E:\\Day12Ex.properties"),"Properties Example");
		System.out.print("\nName: "+p1.getProperty("Name"));  
	    System.out.print("\nDesignation: "+p1.getProperty("Designation")); 
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
