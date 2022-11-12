//ex- kriti -> const-const vowel const vowel == CVCV 

package demo2;

public class ConvertConstVowl {

	public static void main(String[] args) {
		String s = "kriti";
		String ans="";
		String oldstr ="";
		for(int i=0; i <s.length();i++) {
				String res = constvowl(s.charAt(i));
				if(res.compareTo(oldstr)==0) {
					continue;
				}
				else {
					ans+=res;
					oldstr=res;
				}

	    }
		System.out.println(ans);

}

	private static String constvowl(char c) {
		if(c=='a'|| c=='e' || c=='i'||c=='o'|| c=='u') {
			return "V";
		}
		else {
			return "C";
		}
		
	}
}