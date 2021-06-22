public class Ex10 
{    
    public static void main(String[] args) {    
        int r, c, sumR, sumC;    
        int a[][] = {       
                        {1, 2, 3},    
                        {4, 5, 6},    
                        {7, 8, 9}    
                    };    
        r = a.length;    
        c = a[0].length;    
        for(int i = 0; i < r; i++){    
            sumR = 0;    
            for(int j = 0; j < c; j++){    
              sumR = sumR + a[i][j];    
            }    
            System.out.println("Sum of " + (i+1) +" row: " + sumR);    
        }    
        for(int i = 0; i < c; i++){    
            sumC = 0;    
            for(int j = 0; j < r; j++){    
              sumC = sumC + a[j][i];    
            }    
            System.out.println("Sum of " + (i+1) +" column: " + sumC);    
        }    
    }    
}