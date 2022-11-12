package demo1;

import java.util.Scanner;

public class PasswordVarifire {

	public static void main(String[] args) {
		System.out.println("enter the password");
		Scanner sc = new Scanner(System.in);
		String pwd = sc.nextLine();

		int cd = 0, cl = 0, cu = 0, cs = 0;

		String[] lst = pwd.split("");
		for (int i = 0; i < lst.length; i++) {
			// System.out.println(lst[i]+"\t");

			String spacialchars = "(.*[!@#$%^&*|?:~].*)";
			if (lst[i].matches(spacialchars)) {
				cs += 1;
			}
			String upperCaseChars = "(.*[A-Z].*)";
			if (lst[i].matches(upperCaseChars)) {
				cl += 1;
			}

			String lowerCaseChars = "(.*[a-z].*)";
			if (lst[i].matches(lowerCaseChars)) {
				cu += 1;
			}
			String digit = "(.*[0-9].*)";
			if (lst[i].matches(digit)) {
				cd += 1;
			}
		}
		if (cd + cl + cu + cs >= 8 && cd >= 2 && cl >= 2 && cs >= 2) {
			System.out.println("Valid password");
		} else {
			System.out.println("not a valid password");
		}

	}

}