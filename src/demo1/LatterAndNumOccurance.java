package demo1;

import java.util.Scanner;

public class LatterAndNumOccurance {
	
	public static void findOccerance(String w) {
		int[] f = new int[w.length()];
		int visited = -1;
		for(int i=0; i<w.length(); i++) {
			int count=1;
			for(int j=i+1; j<w.length(); j++) {
				if(w.charAt(i)== w.charAt(j)){
				count+=1;
				f[j]=visited;
				}
			}
			if(f[i]!=visited && w.charAt(i)!=' ') {
			    System.out.println(w.charAt(i)+"-------------"+count); //or
			    
				//f[i]=count;
				//System.out.println(w.charAt(i)+"------------------"+f[i]);
			}
		}
	}
	
	public static void method(int[] n) {
		for(int i=0; i<n.length; i++) {
			int count=1;
			for(int j=i+1; j<n.length; j++) {
				if(n[j]==n[i]) {
					count++;
					n[j]=-1;
				}
			}
			if(n[i]!=-1) {
			System.out.println(n[i]+"-----------"+count);
			}
		}
	}

	public static void main(String[] args) {
		String word = "i am kriti";
		findOccerance(word);
		
		int[] arr = { 2,4, 2,7, 2, 1,9, 4 ,1};
		method(arr);

	}

}
