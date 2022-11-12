package mentorproblem;

public class CountWordCheckPrime {
	
	public static void main(String arg[]) {
		String s = "I am Kriti";
		String[] st = s.split(" ");
		int count =0;
		for(int i=0; i<st.length; i++) {
			count+=1;
		}
		System.out.println("total number of word "+count);
		prime(count);
	}
	
	public static void  prime(int count) {
		int flag=0;
		for(int j=2; j<= (count/2)+1; j++) {
			if(count%j==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("its a prime number");
		}
		else {
			System.out.println("its not a prime number");
		}
	}

}
