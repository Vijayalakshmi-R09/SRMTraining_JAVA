package stringhandling;

public class ObjClasses 
{
	int empid;
	String ename;
	int age;
	
	
	public ObjClasses(int empid, String ename, int age) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.age = age;
	}	
		
	void display()
	{
		System.out.println("EmpID: "+empid+"\nEmpName: "+ename+"\nAge: "+age);
	}


	public static void main(String[] args) 
	{
		ObjClasses ob=new ObjClasses(1002, "Sibi", 25);
		ob.display();
	}
}
