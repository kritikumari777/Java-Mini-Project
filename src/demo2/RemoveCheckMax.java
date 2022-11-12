//ex given 4 didit num 5438 remove one digit 448 its max value after removing 3 
package demo2;

import java.util.Collections;
import java.util.LinkedList;


public class RemoveCheckMax {

	public static void main(String[] args) { // we can also solded by the help of StringBulder , StringBuffer
		int n = 5438;
		String[] num = String.valueOf(n).split("");
		LinkedList<String> newlist;
		int maxnum = 0;
	
		for(int i=0; i<num.length; i++) {
			String str="";
			newlist = Remove(num, i);
			for(int j=0; j<newlist.size(); j++) {
		    str+= newlist.get(j);
			}
			int newnum = Integer.parseInt(str);
			System.out.println(newnum);
			if(newnum>maxnum) {
				maxnum=newnum;
			}
		}
		System.out.println("After replacing one digit the maxumem num is : "+maxnum);

	}

	public static LinkedList<String> Remove(String[] num, int i) {
		
        LinkedList<String> linkedList= new LinkedList<String>();  
        Collections.addAll(linkedList, num);   // string[] to LinkedList
	    linkedList.remove(linkedList.get(i));
		return linkedList;
	}

}
