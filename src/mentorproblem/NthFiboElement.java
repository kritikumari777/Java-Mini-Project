package mentorproblem;

import java.util.Scanner;

public class NthFiboElement {

	public static int findNthElement(int i) {
		if (i == 1 || i == 2) {
			return 1;
		} else {
			return (findNthElement(i - 1) + findNthElement(i - 2));
		}
	}

	public static void main(String[] args) {
		System.out.println("enter the humber");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int res = findNthElement(i);
			if (i == n) {
				System.out.println("nth element is " + res);
			}

		}
	}
}
