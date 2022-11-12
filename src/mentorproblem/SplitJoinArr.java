// split an array and join the array

package mentorproblem;

import java.util.Arrays;

public class SplitJoinArr {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 7, 5, 9, 8 };
		int mid = arr.length/2;
		
		int[] farr = new int[mid];
		int[] sarr;
		if (arr.length % 2 == 0) {
			sarr= new int[mid];
		} else {
			sarr= new int[mid+1];
		}
		
		int farr_i = 0;
		int sarr_i = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i < mid) {
				farr[farr_i++] = arr[i];
			} else {
				sarr[sarr_i++] = arr[i];
			}

		}
		System.out.print("first array ");
		System.out.println(Arrays.toString(farr));

		System.out.print("Second Array ");
		System.out.println(Arrays.toString(sarr));
		
		joinArr(farr, sarr); // calling function

	}

	public static void joinArr(int[] farr, int[] sarr) {
		int Totallen = farr.length + sarr.length;
		int[] result = new int[Totallen];
		
		int farr_i = 0;
		int sarr_i = 0;
		for (int i = 0; i < Totallen; i++) {
			if (i < farr.length) {
				result[i] = farr[farr_i++];
			} else {
				result[i] = sarr[sarr_i++];
			}
		}
		System.out.print("joined array");
		System.out.println(Arrays.toString(result));
	}
}
