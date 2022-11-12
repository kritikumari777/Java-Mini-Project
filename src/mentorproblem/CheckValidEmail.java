package mentorproblem;

import java.util.Scanner;

public class CheckValidEmail {

	public static void emailValidation(String s) {
		boolean status = false;
		int x = 4;
		String str = ".com";
		String com = "";
		while (x > 0) {
			com += s.charAt(s.length() - x);
			x--;
		}
		System.out.println(com);
		if(com.compareTo(str)!=0) {
			status = false;
		}
		else {
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='.'||s.charAt(i)=='_'||s.charAt(i)=='-'||s.charAt(i)=='@'||(s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='0' && s.charAt(i)<='9'))
			{
				status = true;
			}
			else {
				status = false;
				break;
			}
		}
		}
		
		if(status) {
			System.out.println("valid email");
		}
		else {
			System.out.println("not valid");
		}
}

	public static void main(String[] args) {
		System.out.println("enter a email id");
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		
		emailValidation(email);
	}
}