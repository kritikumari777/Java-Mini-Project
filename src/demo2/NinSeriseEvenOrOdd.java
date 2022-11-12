package demo2;

public class NinSeriseEvenOrOdd {

	public static void main(String[] args) {
	   String s = "1234567891011121314151617181920";
	   int n=10;
	   System.out.println(s.charAt(n+1));
	   System.out.println(EvenOdd(s.charAt(n+1)));
	}

	public static String EvenOdd(char charAt) {
		if(charAt%2==0) {
			return "EVEN";
		}
		else {
			return "ODD";
		}
		
	}

}
