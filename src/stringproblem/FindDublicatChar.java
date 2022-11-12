//Java program to find the duplicate characters in a string
//Java program to find the duplicate words in a string

package stringproblem;

import java.util.Scanner;

public class FindDublicatChar {

	public static void findDublicateCh(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(j) == s.charAt(i)) {
					str += s.charAt(j);
				}
			}
		}

		System.out.println(str);
	}

	public static void findDublicateWord(String s) {
		String[] str = s.split(" ");
		String dubstr = "";
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[j].compareTo(str[i]) == 0) {
					dubstr += str[j];
					dubstr += " ";
				}
			}
		}
		System.out.println(dubstr);
	}

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		// findDublicateCh(s);

		findDublicateWord(s);

	}
}