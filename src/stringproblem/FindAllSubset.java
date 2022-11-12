// Java Program to find all subsets of a string
//All the possible subsets for a string will be n(n+1)/2.

//all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.

package stringproblem;

public class FindAllSubset {
	
	public static void main(String[] args) {
	   
	String s = "FUN";
	int n=s.length();
	int len = n*(n+1)/2;
	String[] arr = new String[len];
	int index=0;
	for(int i=0; i<n; i++) {
		for(int j=i; j<n; j++) {     // s.substring(i, j+1)); Find substring between a given range, for i=0
			arr[index++]= s.substring(i,j+1); //(0,1) -> F ,because 0 is include and 1 is exclude.
		}                                     // (0,2) -> FU , if(0,3) -> FUN 
		
	}

	for(int i=0; i<len; i++) {
		System.out.println(arr[i]);
	}
	}

}
