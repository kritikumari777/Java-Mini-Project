//how do you calculate the number of vowels and consonants in a string

package demo1;

import java.util.Scanner;

public class filterVowleConst {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s=s.toLowerCase();
		int cv=0, cc=0;
		for (int i=0; i<s.length(); i++) {
	      if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u') {
	    	  cv++;	
			}
	      else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
	    	  cc++;
	      }
		}
		System.out.println("number of vowle is "+cv);
		System.out.println("number of consonant is "+cc);

	}

}
