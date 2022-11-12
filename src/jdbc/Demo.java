package jdbc;

import java.util.Scanner;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		try {
			//dbconnect.getconnection();
			//System.out.println("connection sucessuful");
		StudentDao obj = new StudentDao();
		//List<StudentTo> list=obj.getAllStudents();
		//for(StudentTo x: list) {
		//System.out.println(x);
		//}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id name city");
		StudentTo obj1=new StudentTo();
		obj1.setSid(sc.nextLine());
		obj1.setSname(sc.nextLine());
		obj1.setCity(sc.nextLine());
		obj.insertStudent(obj1);
		System.out.println("data added secussfully");
		
		
		}catch(Exception e) {
			System.out.println("connection failure"+e);
			
		}

	}


}
