package demo1;

import java.util.Arrays;

public class FindDubliateElement {
	public static void findDublicate(int[] lst) {
		int visited=-1;
		int index=0;
		int[] fd = new int[lst.length];
		
		for(int i=0; i<lst.length; i++) {
			int count=0;
			for(int j=i+1; j<lst.length; j++) {
				if(lst[i]==lst[j]) {
					count+=1;
					fd[j]=visited;
				}
			}
			if(fd[i]!=visited && count>0) {
				fd[index++]=lst[i];
			}
		}
		for(int i=0; i<index; i++) {
			System.out.print(fd[i]+" ");
		}
		
	}
	
	//or
	public static void filterdublicate(int[] arr) {
		int[] dublicate= new int[arr.length];
		int index=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]==arr[i]) {
					dublicate[j]=-1;
					dublicate[index++]=arr[j];
				}
			}
		}
		for(int i=0; i<index; i++) {
			if(dublicate[i]!=-1) {
			System.out.print(dublicate[i]+" ");
			}
		}
		}

	public static void main(String[] args) {
    int[] lst = new int[]{8, 2, 3, 4, 2, 4, 6, 4, 7, 8, 3};
    findDublicate(lst); //or
    
    System.out.println();
    filterdublicate(lst);
	}

}
