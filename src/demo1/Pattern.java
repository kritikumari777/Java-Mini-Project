package demo1;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		RightHalfPyr(n);
		//invertedHalfPatt(n);
		//pullPrymid(n);
	    //numHalfPrymid(n);
		//InvertedHalfPatt(n);
		//halfPrymid(n);
		
	}
	private static void RightHalfPyr(int n) {
		for(int i=1; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	//123
	//12
	//1
    private static void invertedHalfPatt(int n) {
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	//*
   //***
  //*****
	private static void pullPrymid(int n) {
		for(int i=0; i<n; i++) {
			for(int j=n-i; j>=0; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<(i*2+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	//1
	//12
	//123
	private static void numHalfPrymid(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

	//***
	//**
	//*
    public static void InvertedHalfPatt(int n) {
		for(int i=0; i<n; i++) {
			for(int j=n-i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	//*
	//**
	//***
	public static void halfPrymid(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
