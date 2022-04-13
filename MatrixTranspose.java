package matrixtranspose;

import java.util.Scanner;

public class MatrixTranspose {


    public static void main(String[] args) {
        int row,col,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row=sc.nextInt();
        System.out.println("Enter the number of column");
        col=sc.nextInt();
        int mat1[][]=new int[row][col];
        System.out.println("Enter the array values");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
               mat1[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("the matrix is"); 
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
               System.out.print(mat1[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("Transpose of the matrix is"); 
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
               System.out.print(mat1[j][i]+"\t");
            }
            System.out.print("\n");
        }
    
}
}