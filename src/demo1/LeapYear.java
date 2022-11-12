package demo1;

import java.util.Scanner;

public class LeapYear {

	public void isLeapYear(int y) {
		if (y % 4 == 0) {
			if (y % 100 == 0) {
				if (y % 400 == 0) {
					System.out.println("it is a leap year");
				} else
					System.out.println("it is not a leap year");
			} else
				System.out.println("it is a leap year");
		} else
			System.out.println("it is not a leap year");
	}

	public static void main(String[] args) {
	System.out.println("enter a year");
    Scanner sc= new Scanner(System.in);
    Integer y = sc.nextInt();
    
    LeapYear ly = new LeapYear();
    ly.isLeapYear(y);
    
	}

}
