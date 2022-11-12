// 145 --> 1!+4!+5! ==145 then its Peterson Number 
package numproblem;

public class PetersonNum {

	public static void main(String[] args) {
	int num = 145;
	int n=num;
	int rem =0;
	int sum=0;
	while(n>0) {
		rem=n%10;
		int f=1;
		while(rem>0) {
			f*=rem;
			rem--;
		}
		sum+=f;
		n=n/10;
	}
	System.out.println(sum);
	if(num==sum) {
		System.out.println("both are equal");
	}
	else {
		System.out.println("not elual");
	}
	}

}
