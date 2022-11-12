package numproblem;

import java.util.Scanner;

public class CombinationOfSeries {
	
	static void findNthTerm(int n)
	{
	    // If n is even
	    if (n % 2 == 0)
	    {
	        n = n / 2;
	        n = 2 * (n - 1);
	        System.out.println(n / 2);
	    }
	     
	    // If n is odd
	    else
	    {
	        n = (n / 2) + 1;
	        n = 2 * (n - 1);
	        System.out.println(n);
	    }
	}

	  public static void main(String[] args)
	  {
		    for(int i=1; i<=10; i++) {
			    findNthTerm(i);
			    }
			    int X = 7;
			    findNthTerm(X);
		  
       // or---------------------------------------------------------
		
		    Scanner sc = new Scanner(System.in);
		    System.out.println("enter the number ");
		    int n = sc.nextInt();
		    int a = 0, b = 0;
		    if(n % 2 == 0)
		    {
		      for(int i = 1 ; i <= (n-2) ; i = i+2)
		      {
		        a = a + 2;
		        b = a / 2;
		      }
		      System.out.print(b);
		     }
		     else
		     {
		       for(int i = 1 ; i < (n-2) ; i = i+2)
		       {
		         a = a + 2;
		         b = a / 2;
		       }
		       a = a + 2;
		       System.out.print(a);
		     }
		   }
	  
		}