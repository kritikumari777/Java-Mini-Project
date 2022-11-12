package typeofconversion;

public class LongTo_ {

	public static void main(String[] args) {
		long lg =10;
		
		//long to String
		String s1 = String.valueOf(lg+10);
		System.out.println("string "+s1.length());
		String s2 = Long.toString(lg);
		System.out.println("string "+s2.length());
		String s3 = String.format("%d",lg);
		System.out.println("string "+s3.length());

	}

}
