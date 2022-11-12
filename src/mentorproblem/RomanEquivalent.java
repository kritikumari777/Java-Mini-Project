//store an array into hashmap as a key and its respective Roman equivalent as its value
//[1 2 3 9 15 18] Create function to convert integer into Roman
package mentorproblem;

import java.util.HashMap;

public class RomanEquivalent {
	
	public static void main(String arge[]) {
		
		int[] arr = {1,2,3,9,15, 18, 25, 490, 500, 570};
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		for(int i=0; i<arr.length; i++) {
			String res=convert(arr[i]);
			hm.put(arr[i], res);
		}
			System.out.println("hasemap is "+hm);
	}
	public static String convert(int n) {
		String ans = "";
		String[] roman = {" ", "I","II","III","IV","V","VI","VII","VIII","IX","X"};
		String[] tents = {" ", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
		String[] thouhundred={"","", "CC", "CCC", "CD", "D", "DC","DCC", "DCCC", "CM", "M"}; // v=5, x=10, l=50, c=100,d=500, m=1000
		if(n<=10) {
		ans= roman[n];
		}
		else if(n<100) {
		 int tenthdigit =n/10;
		 ans+=tents[tenthdigit];
		 int oncedigit=n%10;
		 ans+= roman[oncedigit];
		 }
		else if(n<10000) {
			int hundredthdigit=n/100;
			ans+=thouhundred[hundredthdigit];
			System.out.print(thouhundred[n/100]);
			int midledigit = (n%100)/10;
			ans+=tents[midledigit];
			ans+=roman[n%10];
		}
		return ans;
	}	
}
