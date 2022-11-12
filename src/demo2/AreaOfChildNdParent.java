package demo2;

class ParentArea{
	
	public ParentArea() {
		System.out.println("ok");
	}

	public void calArea(int r) {
		double area =3.14*r*r;
		System.out.println(area);
	}
	
}

class ChildArea extends ParentArea{
   
	public ChildArea() {
		super();
	}

	public void calArea(int r) {
		System.out.println("child");
	}
	
}

public class AreaOfChildNdParent {

	public static void main(String[] args) {
	 
		ParentArea obj = new ChildArea();
		obj.calArea(2);
		

	}

}
