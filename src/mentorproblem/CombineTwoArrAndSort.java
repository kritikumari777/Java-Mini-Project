package mentorproblem;


import java.util.Arrays;
import java.util.Scanner;
public class CombineTwoArrAndSort {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of 1st array"); 
		//Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		System.out.println("enter the element of 1st array");
		int[] a = new int[n1];
		for(int i=0; i<n1; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter size of 2st array"); 
		int n2 = sc.nextInt();
		
		System.out.println("enter the element of 2nd array");
		int[] b = new int[n2];
		for(int i=0; i<n2; i++) {
			b[i]=sc.nextInt();
		}
		

		
		//int[] a = { 90, 60, 30, 40 ,50,88,90};
		  
        //int[] b = { 50, 60, 20, 30 ,88,40};
  
        int a1 = a.length;
        
        int b1 = b.length;
        
        int c1 = a1 + b1;
  
        int[] c = new int[c1];
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);
  
        System.out.println(Arrays.toString(c));
        Arrays.sort(c); 
        int length = c.length;  
        //length = removeDuplicates(c);  
        
        for (int i=0; i<length; i++)  
        	System.out.print(c[i]+" "); 
    }public static int removeDuplicates(int[] c) {
       
        int count = 0;
        
        for (int i = 0; i < c.length; i++) {
            
            if (i < c.length - 1 && c[i] == c[i + 1]) {
                continue;
            }
            
            c[count] = c[i];
            count++;
        }
        return count;
        
    } 
}