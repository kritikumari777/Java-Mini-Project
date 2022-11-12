package demo2;

import java.util.Arrays;

public class YouDletthis {

	public static void main(String[] args) {
		int[] arr = {2,4,3,5,1};
	
		for(int i=1; i<arr.length; i++) {
			int key=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>key) {
					arr[j]=arr[j-1];
                    j--;
			}
			arr[j]=key;
		}
		System.out.println(Arrays.toString(arr));

	}

}
