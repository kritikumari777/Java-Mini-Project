// write a program to count the occurrence of character and its occurrence if num of occurrence is more then one the 
// display like this "2A3B3CA2B2DA"
package mentorproblem;

public class NumOfOccurWithChar {

	public static void main(String[] args) {
		String s = "AABBBCCCABBDDAAA";
		String ch="";
		String str="";
		int j=1;
		for(int i=0; i<s.length(); i++) {
			ch+=s.charAt(i);
			System.out.println(ch);
			if(j==s.length()) {
				str+=ch.length();
				str+=ch.charAt(i);
				System.exit(0);
			}
			else if(s.charAt(i)!=s.charAt(j)) {
				if(ch.length()>1) {
					str+=ch.length();
					str+=ch.charAt(0);
				}
				ch="";
			}
	       j++;
		}
		System.out.println(str);

	}

}
