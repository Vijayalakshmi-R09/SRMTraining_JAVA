package regexprmi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNamePwdValid 
{
	public static boolean isValidUsername(String name)
    {
        String regex = "^[A-Za-z]\\w{5,15}$";
        Pattern p = Pattern.compile(regex);
        if (name == null) 
        {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }
 
	public static boolean
    isValidPassword(String password)
    {
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);
        return m.matches();
    }
	
    public static void main(String[] args)
    {
    	System.out.println("**************************");
    	System.out.println("Pattern Validation");
    	System.out.println("**************************");
    	Scanner sc=new Scanner(System.in);
    	System.out.println("UserName: ");
        String userName= sc.nextLine();
        System.out.println("Password: ");
        String passWd= sc.nextLine();
        System.out.println("Valid Username"+isValidUsername(userName));
        System.out.println("Valid Password"+isValidPassword(passWd)); 
    }
}


