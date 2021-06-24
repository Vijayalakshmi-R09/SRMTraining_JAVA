package com.srm.javatraining;

public class Prime {

  public static void main(String a[]) {
  int n=Integer.parseInt(a[0]);
    boolean flag = false;
    for (int i = 2; i <= n / 2; ++i) {
      if (n % i == 0) {
        flag = true;
        break;
      }
    }
    if (!flag)
      System.out.println(n + " is a Prime number.");
    else
      System.out.println(n + " is not a Prime number.");
  }
}