package stringproblem;

import java.util.Scanner;

public class ReplaceSpaceWithSC {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		
		StringBuilder sb = new StringBuilder(s);
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				sb.deleteCharAt(i);
				sb.insert(i, "_"); //or
				
				//sb.replace(i,i+1, "_");
				
			}
		}
		for(int i=0; i<sb.length(); i++)
		System.out.print(sb.charAt(i));

	}

}
