/*
**  Given Example of a pattern below:
**               1
**              1 1
**             1 2 1
**            1 3 3 1
**           1 4 6 4 1
**         1 5 10 10 5 1
**        1 6 15 20 15 6 1
**  Complete the 'pattern' function below so that given a
**  col and a row it will return the value in that position.
*  Example, pattern(1,2) should return 2*
*/

package mentorproblem;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	   static int factorial(int n) {
		      int f;

		      for(f = 1; n > 1; n--){
		         f *= n;
		      }
		      return f;
		   }

  public static  int pattern(int row, int col){
	  return factorial(row) / ( factorial(row-col) * factorial(row) );
	   }

  public static void main(String[] args) {
	  
      System.out.println();
      int n, i, j;
      n = 100;

      for(i = 1; i <= n; i++) {
         for(j = 1; j <= n-i; j++){
            System.out.print(" ");
         }
         for(j = 1; j <= i; j++){
            System.out.print(" "+pattern(i, j));
         }
         System.out.println();
      }
      
       if(Solution.pattern(0,0) ==  1 &&
                  Solution.pattern(1,2) ==  2 &&
                  Solution.pattern(5,6) ==  6 &&
                  Solution.pattern(4,8) ==  70 &&
                  Solution.pattern(6,6) ==  1) {
             System.out.println("Pass");           
       }else {
             System.out.println("Failed");
       }
  }
}