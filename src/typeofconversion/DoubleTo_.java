package typeofconversion;

public class DoubleTo_ {

	public static void main(String[] args) {
        long l=30;
        
        //duble to string
        String s1 = String.valueOf(l);
        System.out.println(s1.length());
        String s2=Double.toString(l);
        System.out.println(s2.length());

	}

}
