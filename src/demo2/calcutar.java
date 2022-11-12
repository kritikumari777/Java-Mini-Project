package demo2;

import java.util.Scanner;

public class calcutar {
	
	public static void calcutate(double n1, double n2, char opr) {
		if (n1>100 && n2>100) {
			System.out.println("out of range");
		}
		else {
		switch(opr) {
		case '+':
			System.out.println((int)(n1+n2));
		break;
		case '-':
			System.out.println((int)(n1-n2));
		break;
		
		case '/':
			System.out.println(n1/n2);
		break;
		case '*':
			System.out.println((int)(n1*n2));
		break;
		default:
			System.out.println("invalid input");
		}
	  }
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);  // 3 + 4  9
	System.out.println();
	double n1 = sc.nextDouble();
	char opr = sc.next().charAt(0);
	double n2 = sc.nextDouble();
	
     calcutate(n1, n2, opr);
	}

}
