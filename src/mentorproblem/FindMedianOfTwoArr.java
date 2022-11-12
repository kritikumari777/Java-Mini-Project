package mentorproblem;
//Find median of two sorted arrays(pseudo code below):
//ex. {1, 3} and {2} is 2

public class FindMedianOfTwoArr
{
public static double logic(int[] A, int[] B) {

	double[] result = new double[A.length+B.length]; // for sum of two array
	int index=0;
    for(int i=0; i<A.length; i++) {
	   result[index++]=A[i];
     }
    for(int i=0; i<A.length; i++) {
 	   result[index++]=B[i];
      }
    
    // for sorting the array
	int n= result.length;    
	for(int i=0; i<n; i++) {
		for(int j=1; j<(n-i); j++) { 
			if(result[j-1]> result[j]) { 
				//swap
				double temp=result[j];
				result[j]=result[j-1];
				result[j-1]=temp;
			}
		}
	}
	// to find median of resulting array
	int mid=result.length/2;
	double res;
	if(mid%2==0) {
		return (result[mid-1]+result[mid])/2;
		
	}
	else {
		res=result[mid];
		
	}
     return res;
}

public static boolean pass()
{
 boolean result = true;
 result = result && logic(new int[]{1, 3}, new int[]{2, 4}) == 2.5;
 return result;
};

public static void main(String[] args)
{
 if(pass())
 {
   System.out.println("pass");
 }
 else
 {
   System.out.println("some failures");
 }
}
}