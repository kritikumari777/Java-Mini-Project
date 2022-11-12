package demo2;

public class EvulateExpression {

	public static void main(String[] args) {
		char[] Expr = {2+3+5*4/2};
		for(int i=0; i<Expr.length; i++) {
		  System.out.println(Evulates(Expr[i]));
		 
		}

	}

	private static int Evulates(char expr) {
		return expr;
		
	}

}
