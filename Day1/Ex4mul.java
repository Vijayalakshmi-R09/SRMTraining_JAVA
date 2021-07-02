package com.srm.javatraining;
public class Ex4mul
{
public static void main(String args[]){  
int a[][]={{1,1,1},{2,1,1},{3,1,3}};    
int b[][]={{1,1,1},{1,3,1},{2,1,1}};    
    
int c[][]=new int[3][3];  
System.out.println("Multiplication of 2 Matrices: ");
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=0;      
for(int k=0;k<3;k++)      
{      
c[i][j]+=a[i][k]*b[k][j];      
}
System.out.print(c[i][j]+" ");  
}//end of j loop  
System.out.println();
}    
}}  