package demo2;

public class CheckNum {

	public static void main(String[] args) {
		int n = 45;
		int squre = (int) Math.pow(n, 2);
		String sqr = String.valueOf(squre);
		if (sqr.length() % 2 == 0) {
			System.out.println(sqr);
			int len = sqr.length() / 2;
			String firstnum = "";
			String secondnum = "";
			for (int i = 0; i < len; i++) {
				firstnum += sqr.charAt(i);
				secondnum += sqr.charAt(len + i);

			}
			int sum = Integer.valueOf(firstnum) + Integer.valueOf(secondnum);
			if (sum == n) {
				System.out.println(sum + " currect " + n);
			} else {
				System.out.println(sum + " wrong " + n);
			}

		} else {
			System.out.println("number cant be divided in equal part");
		}
	}

}
