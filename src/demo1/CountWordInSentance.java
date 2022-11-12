package demo1;

import java.util.Scanner;

public class CountWordInSentance {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc  = new Scanner(System.in);
		String s= sc.nextLine();
		
		int cw = 0;
		int cl=0;
		//String[] sen = s.split(" ");
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch==' ') {
				cw+=1;
			}
			else {
				cl+=1;
			}
		}
		System.out.println("total number of word "+(cw+1));
		System.out.println("total number of latter "+cl);

	}

}
