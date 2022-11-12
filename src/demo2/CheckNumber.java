// if number is odd then product else sum
package demo2;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		System.out.println("enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = String.valueOf(n);
		if(n%2!=0) {
			int product=1;
			for(int i=0; i<str.length(); i++) {
				String digit = String.valueOf(str.charAt(i));
				product = product*Integer.valueOf(digit);

			System.out.println(product);
		}
	  }
		else {
			int sum=0; 
			for(int i=0; i<str.length() ; i++) {
				String dig = String.valueOf(str.charAt(i));
				sum+=Integer.valueOf(dig);
			}
			System.out.println(sum);
		}

	}
}
