package mentorproblem;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearToYearFindFri {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the year: ");
		int year1 =sc.nextInt();
		System.out.println("enter second yerar");
		int  year2=sc.nextInt();
		
		Calendar cal = new GregorianCalendar();
		
		String[] month = {"January", "February", "March", "April", "May", "June", "July", "August","September","October","November","December"};
		
		int startDay=0;
		int totalDay=0;
		for(int y = year1; y<=year2; y++) {
			System.out.println("------------------"+y+"------------------");
		for(int i=0; i<12; i++) {
		cal.set(y, i, 1);
		startDay = cal.get(Calendar.DAY_OF_WEEK);
		totalDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("--------"+month[i]+"--------");
		
		printCalendar(startDay, totalDay);
		
		System.out.println();
		}
	  }
	}
	public static void printCalendar(int startDay, int totalDay) {
		System.out.println("Sun Mon Tus Wes Tru Fri Sat");
		int weekIndex=0;
		for(int day=1; day<startDay; day++) {
			System.out.print("    ");
			weekIndex++;
		}
		for(int day=1; day<=totalDay; day++) {
			if(day<10) {
				System.out.print(" "+day);
			}
			else {
				System.out.print(day);
			}
			weekIndex++;
			
		    if(weekIndex==7) {
		    	weekIndex=0;
			 System.out.println();
		    }
		    else {
		    	System.out.print("  ");
		    }
		}
		System.out.println();
	}

}
