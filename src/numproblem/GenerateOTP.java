package numproblem;

import java.util.Random;


public class GenerateOTP {

	public static void main(String[] args) {
		Random rd = new Random();
		int otp = rd.nextInt(10000);
		System.out.println(otp);

	}

}
