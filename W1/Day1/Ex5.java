package com.srm.javatraining;
public class Ex5
{
public static void main(String args[]){  
int a[][]={{1,1,1},{2,1,2},{3,1,3}};    
System.out.println("Matrix");
for (int i = 0; i < 3; i++)
{
for (int j = 0; j < 3; j++)
{
System.out.print(a[i][j] + " ");
}
System.out.print("\n");
} 
System.out.println("Inverse of Matrix");
for (int i = 0; i < 3; i++)
{
for (int j = 0; j < 3; j++)
{
System.out.print(a[j][i] + " ");
}
System.out.print("\n");
}
}
}