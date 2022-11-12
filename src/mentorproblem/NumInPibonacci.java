package mentorproblem;

import java.util.Scanner;

public class NumInPibonacci {
	
    public static void main(String arg[]) {
    	System.out.println("enter the key to found: ");
    	Scanner sc = new Scanner(System.in);
    	long k = sc.nextInt();
    	long i=1; 
    	long res=0;
    	while(true) {
    		res =fibonacci(i);
    		System.out.println(res);
    		if(res==k) {
    			System.out.println(k+" found at position "+i);
    			break;
    		}
    		else if(res>k) {
    				System.out.println("not found");
    				break;
    		}
    		i++;
    	}
    }
    
    public static int fibonacci(long i) {
    		if(i==1 || i==2) {
    			return 1;
    		}
    		else {
    			return (fibonacci(i-1)+fibonacci(i-2));
    		}
    	}
    }

