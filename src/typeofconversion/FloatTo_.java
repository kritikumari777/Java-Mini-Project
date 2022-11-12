package typeofconversion;

public class FloatTo_ {

	public static void main(String[] args) {
		float flt =20.0f;
		
		//float to String
		String s1 = String.valueOf(flt);
		System.out.println(s1.length());
		String s2 = Float.toString(flt);
		System.out.println(s2.length());

	}

}
