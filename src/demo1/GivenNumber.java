package demo1;

import java.util.Scanner;

public class GivenNumber {

	void evenOdd(int n) {
	 if(n%2==0)	{
		System.out.println(n+" is a even number"); 
	 }
	 else {
		 System.out.println(n+" is a odd number");
	 }
	}
	void factroial(long n) {
		long i=1;
		long fact=1;
		while(i<=n) {
			fact*=i;
			i++;
		}
		System.out.println(fact+" is factorial of a number");
	}
	void prime(long n) {
		long f=0;
		long i;
		for(i=2; i<(n/2)+1; i++) {
				if(n/i==0) {
					f=1;
					break;
				}
		}
		if (f==1) {
			System.out.println(n + " is not a prime number");
		}
		else {
			System.out.println(n+ " is a prime munber");
			}
			}
	void palindrom(long n) {
	long num=n;
	long rev=0;
	long rem=0;
	while(num>0){
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	if (n==rev) {
		System.out.println(rev+" is a polidrom number");	
	}
	else {
		System.out.println(rev+" is not a palidrom number");
	}
	}
	
	public void fibonacc(int n) {
		int a=0;
		int b=1;
		int c=1;
		
		for(int i=0;i<n; i++) {
			System.out.println(a+" ");
			
			a=b;
			b=c;
			c=a+b;
		}
	}
	
	public void allFactorOfNum(int n) {
		int[] factor = new int[n];
		int index=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				factor[index++]=i;
			}
		}
		System.out.println(factor[index-1]);

	}
	public static void main(String[] args) {
		System.out.println("enter a number: ");
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		
		
		GivenNumber gnum = new GivenNumber();
		//gnum.fibonacc(n);
		//gnum.evenOdd(n);
		//gnum.factroial(n);
		//gnum.prime(n);
		//gnum.palindrom(n);
		//gnum.fibonacc(n);
		gnum.allFactorOfNum(n);

	}

}
