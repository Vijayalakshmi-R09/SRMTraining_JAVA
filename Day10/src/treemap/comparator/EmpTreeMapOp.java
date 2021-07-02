package treemap.comparator;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class EmpTreeMapOp {

	public static void main(String[] args) {
		Employee e= new Employee(1001,"Zem","Senior Dev");
		Employee e1= new Employee(1002,"Aema","Programmer");
		Employee e2= new Employee(1003,"Goliath","Team Lead");
		Employee e3= new Employee(1004,"Annabeth","Trainee");
		
		TreeMap<Integer,Employee> tm=new TreeMap<Integer,Employee>();
		tm.put(1,e);
		tm.put(2,e1);
		tm.put(3,e2);
		tm.put(4,e3);
		System.out.println("Employee Details: ");
		for(Map.Entry<Integer,Employee> i:tm.entrySet())
		{
			System.out.println(i.getKey()+" : "+i.getValue());
		}
		System.out.println("\nFirst Record: "+tm.get(1));
		System.out.println("\nEmployee Record with Id(1003): "+tm.get(3));
	}
}
