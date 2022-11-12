package demo1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class NumberMunipulation {
    void equalOrNot(LinkedList<Integer> lst, Scanner sc) {
    	LinkedList<Integer> lst2 = new  LinkedList<Integer>();
    	for(int i=0; i<lst.size();i++) {
    		int n= sc.nextInt();
    		lst2.add(n);
    	}
      Collections.sort(lst);
      Collections.sort(lst2);
      
      boolean status= lst.equals(lst2);
      if(status==true) {
    	  System.out.println(lst + " and "+ lst2 +" are equal");  
      }
      else {
    	  System.out.println(lst+" and "+ lst2 + " are not equal");
      }
    	
    }
	void sum1(LinkedList<Integer> lst) {
		int s=0;
		for(int i = 0; i<lst.size(); i++) {
		s += lst.get(i);
		}
		System.out.println("sum of lst: "+ s);
	}
	
	void avg1(LinkedList<Integer> lst) {
		int s=0, avg=0;
		for(int i=0; i<lst.size(); i++) {
			s+=lst.get(i);
		}
		avg= s/lst.size();
		System.out.println("average of list is: "+avg);
	}
	void min1(LinkedList<Integer> lst) {
		//Collections.min(lst);
		System.out.println("smallest element in the list: "+Collections.min(lst));
	}
	void max1(LinkedList<Integer> lst) {
		//Collections.max(lst);
		System.out.println("largest element in the list: "+Collections.max(lst));
	}
	void count(LinkedList<Integer> lst) {
		System.out.println("totle number of element in list: "+lst.size());
	}
	
    void reverse(LinkedList<Integer> lst) {
    	Collections.reverse(lst);
     System.out.println("revers of list is: "+ lst);
    }

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		LinkedList<Integer> lst = new LinkedList<Integer>();
		System.out.println("enter list number");
		int i=0;
		while (i<num) {
		Integer n = sc.nextInt();
		lst.add(n);
		i++;
		}
		System.out.println(lst);
        
		NumberMunipulation arr = new NumberMunipulation();
		arr.equalOrNot(lst, sc);
		arr.sum1(lst);
		arr.avg1(lst);
		arr.min1(lst);
		arr.max1(lst);
		
		
	}

}
