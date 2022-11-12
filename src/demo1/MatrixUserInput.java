package demo1;

import java.util.Scanner;

public class MatrixUserInput {
	
	
	public static void transMatrix(int r, int c, int[][] matrix1, int[][] trans) {
		System.out.println("transition of matrix");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				trans[j][i] = matrix1[i][j];
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the row");
		int r = sc.nextInt();
		System.out.println("enter the cloume");
		int c= sc.nextInt();
		
		int[][] matrix = new int[r][c];
		
		//enter matrix element
		enterMatrixData(sc, matrix, r, c);
		
		int[][] trans = new int[r][c];
		transMatrix(r, c, matrix, trans);
		
		//print matrix
		printMatrix(matrix, r, c);
	}
	
	//function to enter matrix element
  public static void enterMatrixData(Scanner sc, int[][] matrix, int r, int c) {
   for(int i=0; i<r; i++) {
	   for(int j=0; j<c; j++) {
		   matrix[i][j]= sc.nextInt();
	   }
   }
  }
   
	//function to print matrix
   public static void printMatrix(int[][] Matrix, int r, int c) {
	System.out.println("my matrix is"); 
	for(int i=0; i<r; i++) 
	{
		for(int j=0; j<c; j++) 
		{
			System.out.print(Matrix[i][j]+"\t");
		}
	System.out.println();   
   }
   }
}
