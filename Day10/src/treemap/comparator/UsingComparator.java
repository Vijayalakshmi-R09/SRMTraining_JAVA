package treemap.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class sortByEmpID implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.eno.compareTo(o2.eno);
	}
}

class sortByEmpName implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.name.compareTo(o2.name);
	}
}

public class UsingComparator {

	public static void main(String[] args) {
		ArrayList<Employee> arrl=new ArrayList<Employee>();
		Employee e= new Employee(10010,"Zem","Senior Dev");
		Employee e1= new Employee(10002,"Aema","Programmer");
		Employee e2= new Employee(10030,"Goliath","Team Lead");
		Employee e3= new Employee(10004,"Annabeth","Trainee");
		arrl.add(e);
		arrl.add(e1);
		arrl.add(e2);
		arrl.add(e3);
		System.out.println("Employee Details: ");
		System.out.println("********************************");
		for(int i=0;i<arrl.size();i++)
		{
			System.out.println(arrl.get(i));
		}
		Collections.sort(arrl,new sortByEmpID());
		System.out.println("\nEmployee Details (SortedByID): ");
		System.out.println("********************************");
		for(int i=0;i<arrl.size();i++)
		{
			System.out.println(arrl.get(i));
		}
		Collections.sort(arrl,new sortByEmpName());
		System.out.println("\nEmployee Details (SortedByName): ");
		System.out.println("********************************");
		for(int i=0;i<arrl.size();i++)
		{
			System.out.println(arrl.get(i));
		}	
	}
}
