//convert number into string

package numproblem;

import java.util.Scanner;

public class NumberToWord {
	
	private static String[] tense;

	public static String convertToWord(int n) {
		 String st = Integer.toString(n);
		  int len = st.length();
		  String res="";
	String[] onedigit = {"zero","one","two","three","four", "five", "six", "seven", "eight", "nine"};	
	String[] twodigit = {"ten","eleven","twelve","thriten", "fortin", "fiften", "sixten", "seventy", "eighten", "ninten"};
	String[] tense = {"","","twenty","thrity","fourty", "fivety", "sixty", "seventy", "eighty", "ninety"};
	String[] huntus = {""," hundred "," thousent "};
	
	if(len==1) {
		return onedigit[n];
	}
	if(len==2) {  // we can also write else if()
		if(st.charAt(0)=='1') {
		res= twodigit[st.charAt(1)-'0'];
		}
		else if(st.charAt(1)=='0'){
			res= tense[st.charAt(0)+'0'];
		}
		else {
			res= tense[st.charAt(0)-'0']+onedigit[st.charAt(1)-'0'];
		}
	}
	if(len==3) {   // we can also write else if()
		if(st.charAt(1)=='0' && st.charAt(2)=='0') {
			res= huntus[1];
		}
		else {
			res= onedigit[st.charAt(0)-'0']+huntus[1]+onedigit[st.charAt(2)-'0'];
		}
	}
	if(len==4) {  // we can also write else if()
		if(st.charAt(1)=='0'&& st.charAt(2)=='0' && st.charAt(3)=='0') {
			res= huntus[2];
		}
		else {
			if(st.charAt(2)=='1') {
				res= onedigit[st.charAt(0)-'0']+huntus[2]+twodigit[st.charAt(3)-'0'];
			}
			else {
			res= onedigit[st.charAt(0)-'0']+huntus[2]+tense[st.charAt(2)-'0']+onedigit[st.charAt(3)-'0'];
			}
		}
	}
	return res;
	}
	
	public static void main(String[] arg) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
  System.out.println(convertToWord(n));

}
}