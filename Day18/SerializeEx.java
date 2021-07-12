import java.io.*;

class SerializeEx
{
public static void main(String args[])
{
try{
Employee e=new Employee(01,"Markcus");
System.out.println("Object : "+e);
FileOutputStream fos=new FileOutputStream("exSerial.txt");
ObjectOutputStream os=new ObjectOutputStream(fos);
os.writeObject(e);
os.flush();
os.close();
}catch(IOException ie)
{
}
