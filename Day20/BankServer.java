import java.rmi.*;
public class BankServer
{
public static void main(String args[])
{
try
{
BankImpl bimp=new BankImpl();
Naming.rebind("BankServer",bimp);
System.out.println("Serevr is ready");
}

catch(Exception e)
{
System.out.println("Exception :"+e);
}
}
}