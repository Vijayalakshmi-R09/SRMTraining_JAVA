package com.srm.javatraining;
public class Ex2
{
public static void main(String args[])
{
       int temp;
       int a[] = new int[]{5,3,4,1,2,4,14};
       for (int i = 0; i < a.length; i++) 
       {
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
           }
        }
        System.out.print("Sorting in Ascending Order:");
        for (int i = 0; i < a.length-1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[a.length - 1]);
    }
}