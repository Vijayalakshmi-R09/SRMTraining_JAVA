package stringhandling;

import java.util.Scanner;

public class ReplaceStr {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		s=s.replace("a", "i");
		System.out.println("the replaced string: "+s);
	}
}
