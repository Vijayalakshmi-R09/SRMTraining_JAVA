class Digitcount
{
  public static void main(String args[])
 {

    int l=args.length;
    int count=0;
    for(int i=0;i<l;i++)
    { 
      try{
        int a=Integer.parseInt(args[i]);
        count++;
      }   
   catch(NumberFormatException ex)
   {  
     System.out.println(ex);
    }    
} 
   System.out.println("Numbercounts: "+count);      
}
}
   
   