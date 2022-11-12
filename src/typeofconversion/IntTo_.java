package typeofconversion;

public class IntTo_ {

	public static void main(String[] args) {
		// int  to  string
		int num= 10;
		String s = String.valueOf(num);
		System.out.println(s.length());
		String s1 = Integer.toString(num);
		System.out.println(s1.length());
		String s2 = String.format("%d", num);
		System.out.println(s2.length());

	}

}
