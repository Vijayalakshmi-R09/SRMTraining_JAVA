package exceptionhandl;

public class Student 
{
	 int rollNo;
	 String name;
     int marks;
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	public void marksValidation() throws MarksOutOfBoundException
    {	
    	if(marks > 100)
    	{
    		String e="Marks exceeded the limit";
    		throw new MarksOutOfBoundException(e);
    	}
    	else if(marks<=0)
    	{
    		String e="Invalid Marks Entered";
    		throw new MarksOutOfBoundException(e);
    	}
    	else
    	{
    		System.out.println("Student Record: \n RollNo: "+rollNo+"\n Name: "+name+"\n Marks: "+marks);
    	}
    }
}