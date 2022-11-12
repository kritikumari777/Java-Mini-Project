package demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

class Arr{
	public void arrayList(int n, ArrayList<String> al, Scanner sc) {
		for(int i=0; i<n; i++) {
	        al.add(sc.next());
			}
		    System.out.println(0);
	        System.out.println(al);
	}

	public void linkedLists(int n, LinkedList<Integer> ll, Scanner sc) {
		for(int i=0; i<n; i++) {
			ll.add(sc.nextInt());
			
		}
		System.out.println(ll.get(0));
		ll.remove(0);
		System.out.println(ll);
	}

	public void hashMap(int n, HashMap<String, Integer> hm, Scanner sc) {
		for(int i=0; i<n; i++) {
			hm.put("kriti",1);
			hm.put("priti", 2);
			hm.put("dhfje", 3);
		}
		System.out.println(hm.get("kriti"));
		System.out.println(hm);
	}

	public void hashSet(int n, HashSet<Integer> hs, Scanner sc) {
		for(int i=0; i<n; i++) {
			hs.add(sc.nextInt());
		}
		//System.out.println(hs.get(0)); //  it will not worked because set is not ordered
		System.out.println(hs);
	}
}

public class DiferentTypeOfList {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt();
		
		ArrayList<String> al = new ArrayList<String>();
        Arr obj1 = new Arr();
       // obj1.arrayList(n, al, sc);
      
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Arr obj2 = new Arr();
        obj2.linkedLists(n, ll, sc);
        
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        Arr obj3 = new Arr();
        //obj3.hashMap(n,hm,sc);
        
        HashSet<Integer> hs = new HashSet<Integer>();
        Arr obj4 = new Arr();
        //obj4.hashSet(n, hs, sc);
	}

}
