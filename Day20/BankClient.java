import java.io.*;
import java.rmi.*;
import java.util.Scanner;
public class BankClient
{
public static void main(String args[])
{
int ch;
try
{
String bankserverURL="rmi://"+args[0]+"/BankServer";
BankInterface binter=(BankInterface)Naming.lookup(bankserverURL);
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter the Account Number:");
int ac=Integer.parseInt(sc.next());
System.out.println("\nEnter the Initial Amount:");
int amt=Integer.parseInt(sc.next());
do
{
System.out.println("\n\t1.Withdraw\n\t2.Balance\n\t3.Exit");
System.out.println("\nEnter your choice:");
ch=Integer.parseInt(sc.next());
switch(ch)
{
case 1:
System.out.println("\nEnter amount of Withdraw:");
int wd=Integer.parseInt(sc.next());
System.out.println("Account Number:"+ac);
if(wd>amt)
System.out.println("Balance less unable to proceed withdraw");
else
{
amt= binter.withdraw(wd,amt);
System.out.println("Balance:"+amt);
}
break;
case 2:
System.out.println("Account Number:"+ac);
amt=binter.balance(amt);
System.out.println("Balance:"+amt);
break;
}
}while(ch<3);
} catch(Exception e)
{
System.out.println("Exception :"+e);
}
}
}