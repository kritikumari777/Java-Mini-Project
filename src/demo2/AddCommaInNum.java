//div 2 num and if result id longer then 3 digit then add comma 3,92

package demo2;

import java.util.Scanner;

public class AddCommaInNum {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		String div = divid(n1, n2);
		System.out.println(div);

	}

	public static String divid(int n1, int n2) {
		String q = String.valueOf(n1/n2);
		System.out.println(q);
		String str=" ";
		if(q.length()==3) {
			str=q;
		}
		else if(q.length()>5) {
			str= q+ " not modify";
		}
		else {
			String st="";
		    if(q.length()==4) {
			  for(int i=0; i<q.length(); i++) {
				if(i==0) {
				  st+=q.charAt(i);
				  st+=',';
				}
			    else {
				  st+=q.charAt(i);
			    }
			 }
		    }
			 else if(q.length()==5) {
			 for(int i=0; i<q.length(); i++) {
				if(i==1) {
				  st+=q.charAt(i);
				  st+=',';
			     }
				else {
				  st+=q.charAt(i);
					}	
				}
			  }
		    str=st;
		}
		return str;
	}

}
