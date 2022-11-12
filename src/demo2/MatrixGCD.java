package demo2;

import java.util.Scanner;

public class MatrixGCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(6%16);
		System.out.println("enter a number ");
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[][] C = new int[n][n];
        for (int i =0; i<n ; i++) {
        	A[i] = sc.nextInt();
        }
        for (int j=0; j<n ; j++) {
        	B[j] = sc.nextInt();
        }
	
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			C[i][j]=A[i]*B[j];
		}
	}
	int Ans=0;
	Ans = GCDReault(C, n);
	System.out.println("GCD of array C "+Ans);
	}

	private static int GCDReault(int[][] c, int n) {
		int result=c[0][0];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				result=gcd(result, c[i][j]);
			}
		}
		return result;
		
		
	}

	private static int gcd(int a, int b) {
		if(a==0) {
			return b;
		}
		else 

			return gcd(b%a , a);

		
	}
}
