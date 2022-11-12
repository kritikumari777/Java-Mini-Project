//[1]
//[2, 3]
//[4, 5, 6]
//[7, 8, 9, 10]
//[11, 12, 13, 14, 15]
		
package demo2;

import java.util.ArrayList;

public class PatternGift {

	public static void main(String[] args) {
		int n = 5;
		int element=1;
		for (int i=1; i<=n; i++) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int j=0; j<i; j++) {
				arr.add(element++);
			}
			System.out.println(arr);
			
		}

	}

}
