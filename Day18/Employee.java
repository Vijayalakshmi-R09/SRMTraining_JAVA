import java.io.*;
class Employee implements Serializable
{
private int eno;
private String ename;
Employee(int eno,String ename)
{
this.eno=eno;
this.ename=ename;
}
public String toString()
{
return("Emp no:"+eno+"Emp Name:"+ename);
}
}