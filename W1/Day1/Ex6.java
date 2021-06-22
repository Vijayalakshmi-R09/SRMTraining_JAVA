public class Ex6
{
static int nCr(int n, int r)   
    {  
       return fact(n) / (fact(r) * fact(n - r));   
    }   
    static int fact(int n)   
    {   
         int res = 1;   
        for (int i = 2; i <= n; i++)   
        res = res * i;   
         return res;   
    }   
   public static void main(String[] args)   
   {   
      int n = 15;
      int r=5;
      System.out.println("the value of n :"+n);  
      System.out.println(" the value of r :"+r);

      if(n>=r)
     {
        System.out.println("Value of "+ n+"C"+r+"= "+nCr(n, r)); 
 }	
else{
 System.out.println("n value should be greater than or equals to r value");
   }   
}
}