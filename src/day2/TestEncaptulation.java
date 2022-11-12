package day2;
//import day1.Encaptulationfun; // for outside package that dafine in day1
//import day2.Encaptulationfun; // for inside the package.
public class TestEncaptulation {

	public static void main(String[] args) {
		Encaptulationfun obj = new Encaptulationfun();
		//System.out.println(obj.a);//outside package we can not access
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);//outside package we can access
		//obj.f1();//outside package we can not access because its a private variable
		obj.f2();
		obj.f3();
		obj.f4();// outside the package we can access

	}

}
