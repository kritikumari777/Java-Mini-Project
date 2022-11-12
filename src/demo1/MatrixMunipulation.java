package demo1;

import java.util.Scanner;

public class MatrixMunipulation {
	
	public static void printMatrix(int r, int c, int[][] result) {
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size of 1st matrix row");
		int r1 = sc.nextInt();
		System.out.println("enter size of 1st matrix column");
		int c1 = sc.nextInt();
		
		int[][] matrix1 = new int[r1][c1];
		enterfirstMatrixData(sc, r1,c1,matrix1);
		
		System.out.println("enter size of 2st matrix row");
		int r2 = sc.nextInt();
		System.out.println("enter size of 2nd matrix column");
		int c2 = sc.nextInt();
		
		int[][] matrix2 = new int[r2][c2];
		enterSecondMatrixData(sc, r2,c2,matrix2);
		
		System.out.println("1st matrix is:");
		printMatrix(r1,c1,matrix1);
		System.out.println("2nd matrix is:");
		printMatrix(r2,c2,matrix2);
		
		int[][] sum = new int[r1][c1];
		//sumOfMartrix(r1,c1,r2,c2,matrix1,matrix2, sum);
		//printMatrix(r1,c1,sum);
		
		int[][] sub = new int[r1][c1];
		//subOfMatrix(r1,r2,matrix1,matrix2, sub);
		//printMatrix(r1,c1,sub);
		
		//isEqual(r1,c1,r2,c2, matrix1,matrix2);
		
		int[][] mul = new int[r1][c1];
		mulOfMatrix(r1,c1,r2,c2,matrix1,matrix2, mul);
		printMatrix(r1,c1,mul);
		
	}
	
	public static void enterfirstMatrixData(Scanner sc, int r1, int c1, int[][] matrix1) {
		
		System.out.println("enter the 1st matrix data");
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
	}
	
	public static void enterSecondMatrixData(Scanner sc, int r2, int c2, int[][] matrix2) {
		System.out.println("enter the 2st matrix data");
		for(int i=0; i<r2; i++) {
			for(int j=0; j<c2; j++) {
				matrix2[i][j]=sc.nextInt();
			}
		}
	}
	
	//------------------------------------s----------u---------m------------
	
	public static void sumOfMartrix(int r1, int c1, int r2, int c2, int[][] matrix1, int[][] matrix2, int[][] sum) {
		System.out.println("sum of matrix");
		if(r1==r2 && c1==c2) {
			for(int i=0; i<r1; i++) {
				for(int j=0; j<c1; j++) {
					sum[i][j] = matrix1[i][j]+matrix2[i][j];
				}
			}
		}
		else {
			System.out.println("cant sum matrix");
		}
	}

	
	public static void subOfMatrix(int r1, int c1, int[][] matrix1, int[][] matrix2, int[][] sub) {
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				sub[i][j]=Math.abs(matrix1[i][j]-matrix2[i][j]);
			}
			System.out.println();
		}
	}
	
	
	//--------------------------e-------q-------u-----a-------l--------------------
	
    public static void isEqual(int r1, int c1, int r2, int c2, int[][] matrix1, int[][] matrix2) {
    	int count= 0;
    	if(r1==r2 && c1==c2) {
    	for(int i=0; i<r1; i++) {
    		for(int j=0; j<c1; j++) {
    			if(matrix1[i][j] != matrix2[i][j]) {
    				break;
    			}
    			else {
    			     count++;
    			}
    		}
    	}
    	if(count==r1*c1) {
    		System.out.println("matrix is equal");
    	}
    	else {
    		System.out.println("matrix is not equal");
    	}
     }
    	else {
    		System.out.println("Matrix is not equal");
    	}
    }
	
	//---------------m--------u---------l------------------------------------------------
	
	public static void mulOfMatrix(int r1, int c1, int r2, int c2, int[][]matrix1, int[][] matrix2, int[][] mul) {
		System.out.println("multiplication of matrix");
		if(r1==c2) { //or  if(r1==c2 && c1==r2) 
			for(int i=0; i<r1; i++) {
				int k=0;
				for(int j=0; j<c1; j++) {
					mul[i][j]=matrix1[i][j]*matrix2[k][i];
					k++;
				}
			}
		}
	}
}

