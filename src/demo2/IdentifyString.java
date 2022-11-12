// abcdefggh gavan 4 ->print  abcd , bcde , cdef , defg but not efgg , fggh because it's having dublicate later
package demo2;


public class IdentifyString {

public static void main(String[] arg) {
	
	String str = "abcdefggh";
	int n=4;
	int i=0;
	while(true) {
		String string = "";
		int j;
		for(j=i; j<n+i; j++) {
			string+=(str.charAt(j));
			
		}
		if(str.charAt(j-1)==str.charAt(str.length()-1)) {
			break;
		}
		i++;
		findDublicate(string);
	}
	
}

private static void findDublicate(String st) {
	boolean status=true;
	for(int i=1; i<st.length(); i++) {
		if(st.charAt(i-1)==st.charAt(i)) {
			status=false;
			break;
		}
	}
	if(status) {
		System.out.println(st);
	}
}
	
}
