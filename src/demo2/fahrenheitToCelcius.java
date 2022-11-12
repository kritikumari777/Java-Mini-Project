package demo2;

public class fahrenheitToCelcius {

	public static void main(String[] args) {
		double fat = 77;
		double ces= ((fat-32)*5)/9;
		System.out.println(fat+"F to C: "+ces);
		
		double f=((ces*9)/5)+32;
		System.out.println(ces+"C to F:"+f);

	}

}
