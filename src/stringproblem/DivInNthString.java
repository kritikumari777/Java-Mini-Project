// Java Program to divide a string in 'N' equal parts.

package stringproblem;

public class DivInNthString {

   public static void main(String arge[]) {
     String s = "aaaaabbbbbccccc";
     int n=3;
    if(s.length()%n==0) {
    	String temp="";
    	for(int i=0; i<s.length(); i++) {
    	 temp+=s.charAt(i);
    	 if(temp.length()==s.length()/3) {
    		 System.out.println(temp);
    		 temp="";
    	 }
  	
    	}
    	
    }
    else {
    	System.out.println("we can not devid");
    }
   }
}