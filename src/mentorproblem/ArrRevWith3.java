//Q: Create a method/ function to reverse the array by every 3rd digit with n-2 digit. 
//e.g. Input  a1={1,2,3,4,5,6,7} 
//Output a1= {3,2,1,6,5,4,7}

package mentorproblem;

public class ArrRevWith3 {

	
	public static void main(String[] args) {
	int[] arr = {1,4,2,5,6,3,7,5};
	method(arr);
	}
	
	public static void method(int[] arr) { 
		int[] arr2 = new int[arr.length];
		int len;
		if(arr.length%3==0) {
			len=arr.length/3;
		}
		else {
			len=(arr.length/3)+1;
		}
		
		int index=0;
		int k=0; 
		int i=0;
		for(int j=1; j<=len; j++) {  // 1,2,3
		 k=k+3;   // 3, 6, 9......
		 int x=k;
		while(x>i) {  // j=1 3>0, 2>0, 1>0 : j=2 6>3, 5>3, 4>3 : j=3 9>6 x=arr.length()  .....
			if(x<=arr.length) {
			arr2[index++]=arr[x-1];
			x--;
			}
			else {
				x=arr.length;
			}
		}
		i=k; // 6, 9, .....
		}
		
		for(int p=0; p<arr2.length; p++) {
			System.out.print(arr2[p]+" ");
		}
}
}