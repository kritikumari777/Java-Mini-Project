package demo1;

public class DiffTypeOfSorting {
	
	public static void bubbleSort(int[] arr) {
		System.out.println("After bubble sort");
		int temp=0;
		int n= arr.length;
		for(int i=0; i<n; i++) { // if arr [4,6,2,8,3,9] then
			for(int j=1; j<(n-i); j++) { // for fast loop, i=0 & j=1to(n-i) [4,2,6,3,8,9] ->i=1 & j=2to(n-i)( [2,4,3,4,6,8,9]
				if(arr[j-1]> arr[j]) { // -> i=2 & j=3to(n-i)[2,3,4,6,8,9] , i=3  same, i=4 same , i=5 same.
					//swap
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
		
	// Insertion sort
		public static void insertionSort(int[] arr) {
			System.out.println("After insertion sort");
		 int n1 =arr.length;
		 for(int i=1; i<n1; i++) {
			 int key=arr[i];
			 int j=i;
		        while(j>0 && arr[j-1]>key){
		            arr[j]=arr[j-1];
		            j--;
		        }
		    arr[j]=key;
		 }
	 }
		
	//  selection Sort
		
	public static void selectionSort(int[] arr) {
		System.out.println("After selection sort");
		for(int i=0; i<arr.length-1; i++) {
		int index = i;
		for(int j=i+1; j<arr.length; j++) {// for smallest element
			if(arr[j]<arr[index]) {
				index=j; // searching for smallest index
			}
		}
		int stemp = arr[index];
		arr[index]=arr[i];
		arr[i]=stemp;
		}
	}
	
	public static int[] margeSort(int[] arr) {
		if(arr.length<=1) {
			return arr;
		}
		else {
			int mid = arr.length/2;
			
			int[] left = new int[mid];
			int[] right;
			
			if(arr.length%2==0) {
			right = new int[mid];
			}
			else {
				right = new int[mid+1];
			}
			
			//inser element to left and right
			for(int i=0; i<mid;i++) {
				left[i]=arr[i];
			}
			for(int j=0; j<right.length; j++) {
				right[j]=arr[mid+j];  // mid+j because intering element after mid point 
			}
			
		    int[] result = new int[arr.length];
		
		    left=margeSort(left);
		    right=margeSort(right);
		    result=marge(left,right);
		
		    return result;
		}  
	}
	 public static int[] marge(int[] left, int[] right) 
	 {
		 int[] result = new int[left.length + right.length];
		 int left_i, right_i, result_i ;
		 left_i = right_i = result_i = 0;
		 
		 while(left_i<left.length || right_i<right.length) 
		 {
			 if(left_i<left.length && right_i<right.length) 
			 {
				 if(left[left_i]<right[right_i]) 
				 {
					 result[result_i++]=left[left_i++];
				 }
				 else {
					 result[result_i++]=right[right_i++];
				 }
			 }
			 else if(left_i<left.length) {
				 result[result_i++]=left[left_i++];
			 }
			 else if(right_i<right.length) {
				 result[result_i++]=right[right_i++];
			 }		 
		 }
		 return result;
	 }    

	public static void main(String[] args) {
	 int [] arr = {4,6,2,8,3,9};
	 System.out.println("Before Sorting");
	 for(int i=0; i<arr.length; i++) {
		 System.out.print(arr[i]+" ");
	 }
	 System.out.println();
	 
	 //bubbleSort(arr);
	// insertionSort(arr);
	 selectionSort(arr);
	 //arr=margeSort(arr);
	 //System.out.println("After marge sort");
	 for(int i=0; i<arr.length; i++) {
		 System.out.print(arr[i]+" ");	 
	}
	
}
}