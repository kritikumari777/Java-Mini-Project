package mentorproblem;

import java.util.Scanner;

public class MulArrAndCheck {
	
	public static double check(int[] arr) {
		double mul=1;
		  for(int i=0;i<arr.length; i++) {
			  mul*=arr[i];
		  }
		return mul;
		  
		}

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the element of array");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
	     
	  double res;
	  res=check(arr);
	  if(res==0) {
		  System.out.println("0");
	  }
	  else if(res>1) {
		  System.out.println("1");
	  }
	  else if(res<1) {
		  System.out.println("-1");
	  }
	}
}
