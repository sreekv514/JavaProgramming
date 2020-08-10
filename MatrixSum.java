/* Program to find sum of elements of 2 matrices
 * @author Vandana
 */

import java.util.Scanner;
        
public class MatrixSum {

static int[][] addArrays (int[][] a, int[][] b, int row, int col) { 
    // Method to add two matrices and return the sum as a matrix
    int sum[][] = new int[row][col];
    for (int i = 0 ; i < row ; i++) {
        for(int j = 0 ; j < col ; j++) {
            sum[i][j] = a[i][j] + b[i][j] ;
        }
    }
    return sum;
}

public static void prtf (String str) {
    // Method to reduce print() function
    System.out.print(str);
}

public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    int i = 0, j = 0; // loop variables
    
    prtf ("*** Program to find sum of 2 matrices ***\n");
    
    // Read no. of rows and columns of both matrices
    prtf ("\n\t Enter number of rows and columns of matrices to be added: ");
    int row = sc.nextInt();
    int col = sc.nextInt();

    // Declare matrices of same size
    int a[][] = new int[row][col];
    int b[][] = new int[row][col];
    
    // Read elements of matrix A from user
    prtf("\n\t Insert elements into 1st matrix: \n");
    for(i = 0; i < row; i++) {
        for(j = 0; j < col; j++) {
            prtf("\t Matrix A: Element at position " +i+ ", " +j+ " : ");
            a[i][j] = sc.nextInt();
        }
    }
    
    // Read elements of matrix B from user
    prtf("\n\t Insert elements into 2nd matrix: \n");
    for(i = 0; i < row; i++) {
        for(j = 0; j < col; j++) {
            prtf("\t Matrix B: Element at position " +i+ ", " +j+ " : ");
            b[i][j] = sc.nextInt();
        }
    }
      
    // Call method to calculate and return sum[][]
    int sum[][] = addArrays (a, b, row, col);
    
    // Display matrix A to user
    prtf("\n\t Matrix A: \n\t ");
    for(i= 0; i < row; i++) {
        for(j = 0; j < col; j++) {
            prtf(a[i][j] + " ");
        }
        prtf("\n\t ");
    }
    
    // Display matrix B to user
    prtf("\n\t Matrix B: \n\t ");
    for(i = 0; i < row; i++) {
        for(j = 0; j < col; j++) {
            prtf(b[i][j] + " ");
        }
        prtf("\n\t ");
    }
    
    // Display sum of both matrices
    prtf("\n\t Sum of matrices A & B:\n\t ");
    for(i = 0; i < row; i ++) {
        for(j = 0; j < col; j++) {
             prtf(sum[i][j] + " ");
        }
        prtf("\n\t ");
    }
    
}
}
