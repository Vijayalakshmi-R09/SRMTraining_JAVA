import java.io.*;

class DeSerializeEx
{
public static void main(String args[])
{
try{
FileInputStream fin=new FileInputStream("exSerial.txt");
ObjectInputStream ois=new ObjectInputStream(fin);
Employee e=(Employee)ois.readObject();
ois.close();
System.out.println("Object :"+e);
}catch(Exception ie)
{
}
}
}