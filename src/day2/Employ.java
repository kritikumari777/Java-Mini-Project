package day2;

import java.util.Scanner;

public class Employ {

	int eid;
	String name;
	long salary;
	
	public void setData(int eid, String name, long salary) {
		this.eid= eid;
		this.name= name;
		this.salary= salary;
	}
	public class Student extends Employ{
		int sroll_no;
		String sname;
		double marks;	
	}
	   public void input() {
		   Scanner obj = new Scanner(System.in);
		   System.out.print("enter eid");
		   eid=obj.nextInt();
		   obj.nextLine();
		   System.out.print("enter name");
		   name=obj.next();
		   obj.nextLine();
		   System.out.print("enter salary");
		   salary=obj.nextInt();
		   obj.nextLine();
	   }
	   
		public void display() {
			System.out.println(+eid);
			System.out.println(name);
			System.out.println(+salary);
		}

}
