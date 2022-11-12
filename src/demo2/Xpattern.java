package demo2;

public class Xpattern {

	public static void main(String[] args) {
		int n=5;
		for( int i=1,k=1; i<2*n; i++) {
			for(int j=1; j<2*n; j++) {
				if(j==i || j==(2*n)-i) {
					System.out.print(k);
				}
                
				else {
					System.out.print(" ");
				}
			}
			if(i<n) {
				k++;
			}
			else {
				k--;
			}
			System.out.println();
		}

	}

}
