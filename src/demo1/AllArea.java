
package demo1;

import java.util.Scanner;

public class AllArea {

	public void areaOfSquare(int a) {
		System.out.println(4*a);
	}

	public void areaOfRactangle(int a, int b) {
	System.out.println(a*b);
	}
	
	public void areaOfCircle(double r) {
		System.out.println(31.4*r);	
		}

	public static void main(String args[]) {
		Scanner v1 = new Scanner(System.in);
		int a = v1.nextInt();
		int b = v1.nextInt();
		double r = v1.nextDouble();
		AllArea arr = new AllArea();
		arr.areaOfSquare(a);
	    arr.areaOfRactangle(a,b);
		arr.areaOfCircle(r);
	}

}
