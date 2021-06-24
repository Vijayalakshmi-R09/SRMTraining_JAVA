package com.srm.javatraining;
public class Ex7
{
  public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int num, temp, sum= 0;
        num = n;
        while (num != 0)
        {
            temp = num % 10;
            sum = sum+ temp*temp*temp;
            num /= 10;
        }

        if(sum == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}
