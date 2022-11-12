package demo1;

import java.util.Scanner;

public class ReplaceAllVowel {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		s.append(sc.nextLine().toLowerCase());
		
		//or---------------------------
		//String str = "kriti";
		//String s = str.toLowerCase();
		//StringBuilder sb = new StringBuilder();
		//sb.append(s);
		//-------------------------------
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				s.deleteCharAt(i);
				s.insert(i, 'a');
			}
		}
		System.out.println(s);

	}

}
