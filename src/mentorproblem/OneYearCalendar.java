package mentorproblem;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class OneYearCalendar {
	public static void main(String[] args) {
		 
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter year: ");
	      int year = sc.nextInt();
	 
	      Calendar cal = new GregorianCalendar();
	 
	      int startDay;
	      int numberOfDays;
	      for (int i=0; i<12; i++){
	        cal.set(year, i, 1);
	        startDay = cal.get(Calendar.DAY_OF_WEEK);
	        numberOfDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	        System.out.print(cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US));
	        System.out.println( " " + year);
	        printMonth(numberOfDays,startDay);
	        System.out.println();
	      }
	   }
	 
	   private static void printMonth(int numberOfDays, int startDay) {
	 
	      int weekdayIndex = 0;
	      System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
	 
	      for (int day = 1; day < startDay; day++) {
	         System.out.print("    ");
	        weekdayIndex++;
	      }
	 
	      for (int day = 1; day <= numberOfDays; day++) {
	          if(day<10) {
	    	  System.out.print(" "+day);
	          }
	    	  else {
	    		  System.out.print(day);
	    	  }
	         weekdayIndex++;
	         
	         if (weekdayIndex == 7) {
	            weekdayIndex = 0;
	            System.out.println();
	         } else { 
	            System.out.print("  ");
	         }
	      }
	      System.out.println();
	   }
	}

