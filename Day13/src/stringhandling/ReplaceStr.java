package stringhandling;

import java.util.Scanner;

public class ReplaceStr {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		s=s.replace('i', 'e');
		System.out.println("Replaced String('i'=>'e'): \n"+s);
		StringBuffer sb = new StringBuffer("I is sane.");
                sb.replace(2,4, "am");
		System.out.println("\nUsing StringBuffer Replaced string: \n"+sb);
	}
}
