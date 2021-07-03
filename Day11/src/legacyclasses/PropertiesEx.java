package legacyclasses;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesEx {

	public static void main(String[] args) throws IOException 
	{
		try 
		{
			Properties p=new Properties();  
			Properties p1=System.getProperties();     
			System.out.println();
		    Set set=p1.entrySet();  
			Iterator itr=set.iterator();  
			while(itr.hasNext())
			{  
				Map.Entry entry=(Map.Entry)itr.next();  
				System.out.println(entry.getKey()+" = "+entry.getValue());  
			}     
			p.setProperty("EmployeeID","A001");  
			p.setProperty("EmployeeName","Samuel");  
			p.setProperty("Designation","Trainee");  
			p.store(new FileWriter("E:\\Prop1.properties"),"Properties Example"); 
			System.out.print("\nEmpID: "+p.getProperty("EmployeeID"));  
		    System.out.print("\nEmpName: "+p.getProperty("EmployeeName")); 
		    System.out.print("\nDesig: "+p.getProperty("Designation")); 
		}
		catch (IOException ie)
		{
			System.out.println(ie);
		}
	}
}
