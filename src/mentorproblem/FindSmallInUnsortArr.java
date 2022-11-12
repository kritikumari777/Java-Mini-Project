//find smallest element in unsorted array 

package mentorproblem;

public class FindSmallInUnsortArr { // bubble sort

	public static void main(String[] args) {
		int[] arr = {2, 8, 4, 1, 6,};
		int index=0;
       for(int i=1; i<arr.length; i++) {
    	   if(arr[index]>arr[i]) {
    		   index=i;
    	   }
       }
     System.out.println(arr[index]);
    	  
      }
	}


