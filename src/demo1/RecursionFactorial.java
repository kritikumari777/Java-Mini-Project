package demo1;
import java.util.Scanner;

public class RecursionFactorial {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		Integer num = sc.nextInt();
		
		System.out.println("factorial of two number is "+factorial(num));

	}
	
	public static int factorial(int num) {
		if(num==1) {
			return 1;
		}
		else {
		    return num*factorial(num-1);
		}
}
}
