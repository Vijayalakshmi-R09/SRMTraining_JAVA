package regexprmi;
import java.lang.reflect.Method; 
import java.lang.reflect.Field; 
import java.lang.reflect.Constructor; 
  
class ExClass 
{ 
    
    private String s; 
    public ExClass() 
    {  
    	s = "Vijayalakshmi"; 	
    } 
   
    public void method1() 
    { 
        System.out.println("\nThe string is " + s); 
    } 
  
    public void method2(int n)  
    { 
        System.out.println("\nThe number is " + n); 
    } 
  
    private void method3() 
    { 
        System.out.println("\nPrivate method invoked"); 
    } 
} 
  
class ReflectionExs
{ 
    public static void main(String args[]) throws Exception 
    { 

    	ExClass obj = new ExClass(); 
        Class cls = obj.getClass(); 
        System.out.println("Reflection Example:");
        System.out.println("\nThe name of class is " + cls.getName()); 
        Constructor constructor = cls.getConstructor(); 
        System.out.println("\nThe name of constructor is " + constructor.getName()); 
  
        System.out.println("\nThe public methods of class are : ");
        Method[] methods = cls.getMethods(); 
  
        for (Method method:methods) 
        {
            System.out.println(method.getName()); 
        }
        System.out.println("\nThe Declared methods of class are : ");
        Method[] dmeth = cls.getDeclaredMethods(); 
        
        for (Method method:dmeth) 
        {
            System.out.println(method.getName()); 
        }
        Method m=cls.getDeclaredMethod("method1");
        m.invoke(obj);
        Field field = cls.getDeclaredField("s"); 
        field.setAccessible(true); 
        field.set(obj,"VijayalakshmiRavi"); 
        Method m2 = cls.getDeclaredMethod("method1"); 
        m2.invoke(obj); 
        Method m1 = cls.getDeclaredMethod("method2", int.class); 
        m1.invoke(obj, 10); 
        Method m3 = cls.getDeclaredMethod("method3"); 
        m3.setAccessible(true); 
        m3.invoke(obj); 
        Method m4 = cls.getDeclaredMethod("method2", float.class); 
        m4.invoke(obj, 10.0); 
    } 
}