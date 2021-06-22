public class Ex8
{
public static void main (String[] args)
    {
    int n=Integer.parseInt(args[0]);
    int ecount = 0;
    int ocount = 0;
    while (n > 0)
    {
        int rem = n % 10;
        if (rem % 2 == 0)
            ecount++;
        else
            ocount++;
        n = n / 10;
    }
    System.out.println ( "Even count : " +
                              ecount);
    System.out.println ( "Odd count : " +
                              ocount);
}
}