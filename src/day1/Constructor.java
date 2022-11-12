package day1;

class ParentClass {

	ParentClass() {
		System.out.println("Constructor of Parent");
	}

}

class JavaExample extends ParentClass {
	JavaExample() {
		System.out.println("Constructor of Child");
	}
}

public class Constructor {
	public static void main(String[] args) {
		new JavaExample();
	}
}
