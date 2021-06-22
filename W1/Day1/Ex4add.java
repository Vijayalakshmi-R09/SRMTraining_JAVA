public class Ex4add
{
public static void main(String args[]){  
int mat1[][]={{1,0,1},{2,1,3},{3,8,5}};    
int mat2[][]={{1,1,4},{2,4,3},{1,5,4}};    
    
 
int output[][]=new int[3][3];  
System.out.println("Addition of 2 Matrices: "); 
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
output[i][j]=mat1[i][j]+mat2[i][j];  
System.out.print(output[i][j]+" ");    
}    
System.out.println();
}}  
}