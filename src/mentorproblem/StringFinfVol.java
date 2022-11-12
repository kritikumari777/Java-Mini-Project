//find vowel and check if the order if vowel is a pallendrom or not
package mentorproblem;

import java.util.Scanner;

public class StringFinfVol {

	public static void main(String[] args) {
		
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String vs="";
		int count=0;
		 for(int i=0; i<s.length(); i++) {  // for count vowel
			 if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u') {
				 count++;
				 vs+=s.charAt(i);
			 }
		 }
      System.out.println("Count= "+count);
      
      //for pallendrom 
      String rvs="";
      for(int i=vs.length()-1; i>=0; i--) { 
    	 rvs+=vs.charAt(i);
      }
      if(vs.compareTo(rvs)==0) {
    	  System.out.println(vs+ " and "+ rvs+ " is a Pallyndrom");
      }
      else {
    	  System.out.println(vs+ " and " + rvs+ " is not a Pallyndrom");
      }
	}

}
