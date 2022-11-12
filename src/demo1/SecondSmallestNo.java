package demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondSmallestNo {

	public static void main(String[] args) {
		System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<Integer>();
        int i=0;
        while(i<num) {
        	Integer n = sc.nextInt();
        	lst.add(n);
        	i++;
        }
        Collections.sort(lst);
        System.out.println("print short list: "+lst);
        System.out.println("print second smallest number "+lst.get(1));
	}

}
