package demo1;

import java.util.Scanner;

public class LcmHcfOfTwoNo {
	
	void lcm(long n1, long n2) {
		long b;
		if(n1>n2) {
			b=n1;
		}
		else {
			b=n2;
		}
		System.out.println(b);
		while(b>0) {
			if(b%n1==0 && b%n2==0) {
				break;
			}
			else {
				b+=1;
			}
			
		}
		System.out.println("lcm of two number: "+b);
	}
	
	void hcf(long n1, long n2) {
		long s;
		long hcf=0;
	if(n1<n2) {
		s=n1;
	}
	else {
		s=n2;
	}
	for(int i=1; i<=s; i++) {
		if(n1%i==0 && n2%i==0) {
		hcf=i;
		}
	}
	System.out.println("HCF of two number"+hcf);
	}

	
	public int LCM_of_three_num(int n1, int n2, int n3)
	{
	int LCM = 1;
	if(n1 > n2 && n1 > n3)
	{
	LCM = n1;
	}
	else if(n2 > n1 && n2 > n3)
	{
	LCM = n2;
	}
	else if(n3 > n1 && n3 > n2)
	{
	LCM = n3;
	}
	
	//int K = LCM;  //or  line -> 62 and 74
	
	while(true)
	{
	if(LCM%n1==0 && LCM%n2==0 && LCM%n3==0)
	{
	break;
	}
	else
	{
		LCM++;
		
	//LCM = LCM + K;  //or  
		
	}
	} 
	return LCM;
	} 
	
	//} OUTPUT:
	//12 15 10
	//LCM(12, 15, 10) = 60
	
	public static void main(String[] args) {
		System.out.println("Enter the two number");
		Scanner sc = new Scanner(System.in);
		Integer n1=sc.nextInt();
		Integer n2=sc.nextInt();
		
		LcmHcfOfTwoNo lh= new LcmHcfOfTwoNo();
		//lh.lcm(n1,n2);S
		//lh.hcf(n1, n2);
		System.out.println(lh.LCM_of_three_num(n1, n1, 10));
		//System.out.println("lcm of three number"+result);
		

	}

}
