package day1;

public class Bigestword {

	public static void main(String[] args) {
		String s1 = "I love java language";
		String[] s2 = s1.split(" ");
		String result ="";
		for (int i=0; i<s2.length; i++) {
			if(result.length()<s2[i].length()) {
				result = s2[i];
			}//if
		}//for
		System.out.println("Bigest word in the sentance is: "+result);
		
	}//main

}//class
