
package matrix;

import java.util.Scanner;


public class Matrix {

    public static void main(String[] args) {
        int row,col,i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        row=s.nextInt();
        System.out.println("Enter the number of column: ");
        col=s.nextInt();
        int mat1[][]=new int[row][col];
        int mat2[][]=new int[row][col];
        int res[][]=new int[row][col]; 
        System.out.println("Enter the elments of matrix1:\n ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            
                mat1[i][j]=s.nextInt();
            
                System.out.println();
                     
        }
        System.out.println("Enter the elments of matrix2:\n ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            
                mat2[i][j]=s.nextInt();
            
                System.out.println();
                     
        }
        
        
    
    for(i=0;i<row;i++) 
    {
        for(j=0;j<col;j++){
            
           res[i][j]=mat1[i][j]+mat2[i][j]; 
 
            
        }
    }
    System.out.println("Sum of matrices:-");
 
for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < col ;j++ )
System.out.print(res[i][j]+"\t");
 
System.out.println();
}

    }
    
}
