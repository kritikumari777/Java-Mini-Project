package demo1;

public class DiffTypeOfSearching {
	
	public static void linearSearch(int[] arr) {
		System.out.println("linear search");
		 int i;
		   for(i=0; i<arr.length; i++) {
			   if(arr[i]==7) {
			   System.out.println(arr[i]+ " is found at possition "+(i+1));
			   break;
			   }
		   }
	}
	
	public static void binarySearch(int[] arr) {  //array most be sorted
		for(int i=0; i<arr.length; i++) {
		for(int j=1; j<arr.length-i; j++) { //for shorting
			if(arr[j]<arr[j-1]) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		  }
		}
		System.out.println("sorted array");
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+"\t");
		}
		
		System.out.println("Binary searching");
		int key =7;
        int in =0;
		int fin=arr.length;
		while(in<=fin) {
			int mid=(in+fin)/2;	
		if(arr[mid]==key) {
			System.out.println(arr[mid]+" found at position "+(mid+1));
			break;
		}
		else if(key>arr[mid]) {
			in=mid+1;
		}
		else {
			fin=mid-1;
		}
		}
	}
	public static void main(String[] args) {
	   
	   int[] arr = new int[] {7, 5, 3, 17, 2, 8};
       
	   //linearSearch(arr);
	   binarySearch(arr);

}
}
