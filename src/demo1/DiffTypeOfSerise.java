package demo1;

import java.sql.Array;
import java.util.Scanner;

public class DiffTypeOfSerise {

	void EvenOdd(long num) {
		long i;
		System.out.println("all even number");
		for(i=1; i<num; i++) {	
		if(i%2==0) {
			System.out.println(i);
		}
		}
		
		System.out.println("all odd number");
		for(i=1; i<num; i++) {			
		if(i%2!=0) {
			System.out.println(i);
		}
	}
	}

	void allPrime(long num) {
		System.out.println("all prime number");
		long i, j;
		for (i = 2; i <= num; i++) {
			for (j = 2; j <= (i / 2) + 2; j++) {
				if (i % j == 0) {
					break;
				}
				if (j == (i / 2) + 1) {
					System.out.println(i);
				}
			}

		}
	}

	void allPalindrom(long num) {
		System.out.println("All palindrom number");
		long i;
		for (i = 11; i <= num; i++) {
			long n = i;
			long rem = 0;
			long res = 0;
			while (n > 0) {
				rem = n % 10;
				res = res * 10 + rem;
				n = n / 10;

			}
			if (i == res) {
				System.out.println(res);
			}
		}

	}
     long fibonccSerise(long i) {
			if(i==1 || i==2) {
				return 1;
			}
			else {
				return(fibonccSerise(i-1)+fibonccSerise(i-2));
			}
		}

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();

		DiffTypeOfSerise fn = new DiffTypeOfSerise();
		//fn.EvenOdd(num);
		//fn.allPrime(num);
		//fn.allPalindrom(num);
		for(int i=1; i<=num; i++) {
			System.out.println(fn.fibonccSerise(i));
		}
		
	}

}
