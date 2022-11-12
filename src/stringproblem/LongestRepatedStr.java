//Java Program to find the longest repeating sequence in a string


package stringproblem;

import java.util.HashMap;

public class LongestRepatedStr {

	public static void main(String[] args) {
		
		//HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String s = "aaaaabbeeeffffrrrr";
		String longstr = "";
		String newstr="";
		for(int i=1; i<s.length(); i++) {
			newstr += s.charAt(i-1);
			if(s.charAt(i-1)!=s.charAt(i)) {
				//hm.put(newstr, newstr.length());
				if(longstr.length()<newstr.length()) {
					longstr=newstr;
				}
				newstr="";
			}
			
		}
		//System.out.println(hm);
		System.out.println("longest repetad string is "+longstr+ " occured " +longstr.length()+ " times");

	}

}
