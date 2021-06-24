package com.srm.javatraining;
public class Ex10 
{    
        public static void main(String[] args) {    
        int r, c, sumofR, sumofC;    
        int a[][] = {       
                        {10,20,30},    
                        {20,10,20},    
                        {30,20,10}    
                    };    
          r = a.length;    
        c = a[0].length;    
        for(int i = 0; i < r; i++){    
            sumofR = 0;  
              sumofC = 0;      
            for(int j = 0; j < c; j++){    
              sumofR = sumofR + a[i][j];
	 sumofC = sumofC+ a[j][i];        
            }    
            System.out.println("Sum of " + (i+1) +" row: " + sumofR);    
           System.out.println("Sum of " + (i+1) +" column: " + sumofC);    
        }    
    }   
}
