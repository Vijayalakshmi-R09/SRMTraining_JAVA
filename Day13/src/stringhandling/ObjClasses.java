package stringhandling;

public class ObjClasses 
{
    String name;

    ObjClasses(String n)
    {
    	this.name=n;
    	System.out.println("Constructor invoked");
    	System.out.println("Name: "+name+"\n");
    }
    
    protected void finalize()
    {
    	System.out.println("\nGarbage collected ...");
    }
    
	public static void main(String[] args) 
	{
		ObjClasses ob1=new ObjClasses("Sunny");
		ObjClasses ob2=new ObjClasses("Sunny");
		System.out.println("\nCheck two Objects are equal: "+ob1.equals(ob2));
		System.out.println("\nClass Name (ob2): "+ob2.getClass());
		System.out.println("\nHashcode (ob1): "+ob1.hashCode());
		ob1=null;
		System.gc();
	}
}
