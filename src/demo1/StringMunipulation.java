// remove leading and trailing whitespaces ie \t, \n,??
//String s = "  abc  def\t";		
//s = s.strip();		
//System.out.println(s);

package demo1;

import java.util.Arrays;
import java.util.Scanner;

public class StringMunipulation {

	public void anagram(String w1) { // Anagram means both strings contain the same character set,
		String w2 = "kriti"; // only their order is different. ie cat , tca.
		boolean status = true;
		if (w1.length() != w2.length()) {
			status = false;
		} else {
			char[] arr1 = w1.toLowerCase().toCharArray();
			char[] arr2 = w2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			status = Arrays.equals(arr1, arr2);
		}
		if (status == true) {
			System.out.println(w1 + " and " + w2 + " is an Anagram");
		} else {
			System.out.println(w1 + " and " + w2 + " is not an Anagram");
		}
	}

	public void isogram(String w1) { // an isogram is a word that has no repeating letters.
		int flag = 0;
		for (int i = 0; i < w1.length(); i++) {
			for (int j = i + 1; j < w1.length(); j++) {
				if (w1.charAt(j)==w1.charAt(i)) {
					flag++;
					break; // if one repeated then no need to go throw looping father
				}
			}
		}
		// System.out.println(flag);
		if (flag > 0) {
			System.out.println(w1 + " is not a isogram");
		} else {
			System.out.println(w1 + " is a isogram");
		}
	}

	public void removeWiteSpace(String w1) {
		String str = "";
		for (int i = 0; i < w1.length(); i++) {
			if (w1.charAt(i) == '_') {
				continue;
			} else {
				str += w1.charAt(i);
			}
		}
		System.out.println(str);
	}

	public void concat(String w1) {
		String w2 = "Kumari";
		System.out.println("Concatation of two String:~ " + w1.concat(w2));
		
		//-------------or
		StringBuilder sb = new StringBuilder(w1);
	      sb.append(w2);
	      System.out.println(sb);
	}

	public void joinstring(String w1) {
		String w2 = "kumari";
		for (int i = 0; i < w2.length(); i++) {
			w1 += w2.charAt(i);
		}
		System.out.println("concatation of two string  " + w1);
	}

	public void compare(String w1) {// anagram string if both the string is equal
		String w2 = "kriti";
		w1.toLowerCase();
		w2.toLowerCase();
		boolean status = false;

		if (w1.length() != w2.length()) {
			status = false;
		} else {

			// if(w1.compareTo(w2)==0) {
			// status=true;
			//} -------------or--------------

				if (w1.compareTo(w2)==0) {
					status = true;
				}
			
			if (status == true) {
				System.out.println("Both String are equal " + w1 + " & " + w2);
			} else {
				System.out.println("String are not equal " + w1 + " & " + w2);
			}
		}
	}
	
	public void pallarogram(String w1) {
		String w2 = "moom";
		boolean status = false;
		for(int i=0, j=w2.length()-1; i<j; i++, j--) {
			if(w1.charAt(i)==w2.charAt(j)) {
				status = true;
			}
			else {
				status = false;
				break;
			}
		}
		if(status) {
			System.out.println("same string");
		}
		else {
			System.out.println("not same");
		}
		
	}

	public void countLetter(String w1) {
		int cl = w1.length();
		System.out.println("total letter in latter :~ " + cl);
	}

	public void uperToLower() {
		String w1 = "KRITI";
		//System.out.println("Change uper to lower:~ " +  w1.toLowerCase());
		
		char lower =' ';
		for(int i=0; i<w1.length(); i++) {
			lower = (char)(w1.charAt(i)-32);
		}
		System.out.println(lower);
	}

	public void lowerToUper(String w1) {
		
		//System.out.println("Change lower to uper:~ " + w1.toUpperCase());
	    char uper = ' ';
		for(int i=0; i<w1.length(); i++) {
			uper = (char)((int)w1.charAt(i)-32);
			System.out.print(uper);
		}
	}

	public void reverselater(String w1) {
		String rev = "";

		for (int i = w1.length() - 1; i >= 0; i--) {
			rev += w1.charAt(i);
		}
		System.out.println("Reverse word " + rev);
	}
	
	public void reverseword(String w1) {
		String[] s = w1.split(" ");
		for(int i=s.length-1; i>=0; i--) {
			System.out.print(s[i]+" ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter String in lower case");
		String w1 = sc.nextLine();

		StringMunipulation sm = new StringMunipulation();
		// sm.anagram(w1);
		// sm.isogram(w1);
		// sm.removeWiteSpace(w1);
		//sm.concat(w1);
		// sm.joinstring(w1);
		//sm.compare(w1);
		sm.pallarogram(w1); 
		// sm.countLetter(w1);
		// sm.uperToLower();
		// sm.lowerToUper(w1);
		// sm.reverselatter(w1);
		// sm.reverseword(w1);

	}

}
