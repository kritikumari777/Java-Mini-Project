// Java Program to Find Smallest and largest of Three Numbers Using Ternary Operator

package numproblem;

public class FindSmall {
	
	public static int findsmall(int a, int b, int c){
		int s= a<b?a:b;
		return s<c?s:c;
	}
	
	public static int findLarge(int a, int b, int c) {
		int l= a>b?a:b;
		return l>c?l:b;
	}

	public static void main(String[] args) {
	int a = 5;
	int b=7;
	int c=3;
	//findsmall(a,b,c);
	System.out.println("Smallest number is "+findsmall(a,b,c));
	System.out.println("Largest number is "+findLarge(a,b,c));

	}

}
