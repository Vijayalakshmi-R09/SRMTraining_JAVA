public class SumofDigits
{  
public static void main(String args[])  
{  
int d , sum = 0;   
int n=Integer.parseInt(args[0]);
while(n > 0)  
{  
  d = n % 10;  
  sum = sum + d;  
  n = n/ 10;  
}  
System.out.println("Sum of Digits: "+sum);  			 
}}
