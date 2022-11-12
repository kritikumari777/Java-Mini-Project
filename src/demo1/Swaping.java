package demo1;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		System.out.println("enter the two number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swaping " + a + " " + b);
		//SwaoWthout3rdVar(a, b);
        SwapWith3rdVar(a,b);
	}

	public static void SwaoWthout3rdVar(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swaping without 3rd variable " + a + " " + b);
	}
	
	public static void SwapWith3rdVar(int a, int b) {
		int temp = a;
		a=b;
		b=temp;
		System.out.println("After swaping with 3rd variable "+a+" "+b);
	}

}
