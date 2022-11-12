//9) Java Program to find all the permutations of a string

package stringproblem;

public class Allpromotation {
	public static String swapString(String s, int start, int i) {
		char[] str=s.toCharArray();
		char ch;
		ch  = str[start];
		str[start]=str[i];
		str[i]= ch;
		//System.out.println(String.valueOf(str));
		return (String.valueOf(str));
	}

	public static void main(String[] args) {
		String s = "kriti";
	    int len=s.length();
	    System.out.println("all premutation are: ");
	    generatePremutation(s, 0, len);

	}
	
	public static void generatePremutation(String s, int start, int end) {
		if(start==end-1) {
			System.out.println(s);
		}
		else {
			for(int i=start; i<end; i++) {
				//System.out.println("s "+start+" i "+i);
				s=swapString(s,start, i);
				//System.out.println("s "+(start+1)+" e "+end);
				
				generatePremutation(s, start+1, end);
				//System.out.println("sa "+start+" ia "+i);
				s=swapString(s,start, i);
			}
		}
	}

}
