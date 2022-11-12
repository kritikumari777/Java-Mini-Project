// find those element whose position after shorting  remance same 
package demo2;

import java.util.Arrays;
import java.util.Scanner;

public class AfterSortPosSame {

	public static void main(String[] args) {
		System.out.println("enter array number");
		Scanner sc = new Scanner(System.in);
		int n=3;
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] arr2 = new int[n];
		System.arraycopy(arr, 0, arr2, 0, n);
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[i]) {
				int	temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr2));
		int count=0;
		for(int i=0; i<n; i++) {
			if(arr[i]==arr2[i]) {
				count++;
				System.out.println(count+" fount that is "+ arr[1]);
				
			}
			else {
				continue;
			}
			
		}

	}

}
