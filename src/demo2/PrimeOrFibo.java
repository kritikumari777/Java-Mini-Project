package demo2;

public class PrimeOrFibo {
	
	public static int[] prime(int n) {
		int[] primearr = new int[n];
		int index=0;
		int i=2;
		while(index<n){
			int flag=0;
			for(int j=2; j<(i/2)+1; j++) {
				if(i%j==0) {
					flag=1;
				}
			}
			if(flag==0) {
				primearr[index++]=i;
			}
			i++;
		}
		return primearr;
		
	}
	
	public static int[] fibo(int n) {
		int[] fibo = new int[n];
		int index=0;
		int a=0;
		int b=1;
		int c=a+b;
		while(index<n) {
			fibo[index++]=a;
			a=b;
			b=c;
			c=a+b;
		}
		return fibo;
		
	}

	public static void main(String[] args) {
		int n=7;
		int[] allprime =prime(n);
		int[] allfibo= fibo(n);
		for(int i=0; i<n; i++){
			System.out.print(allprime[i]+ " "+ allfibo[i]+" ");
	}


	}

}
