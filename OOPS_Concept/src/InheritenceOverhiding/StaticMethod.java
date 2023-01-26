package InheritenceOverhiding;
class Step1{
	void display() {
		System.out.println("there are Step1 class");
	}
}
class Step2 extends Step1{
	void display() {
		super.display();
		System.out.println("There are Step2 Class");
	}
	void disk() {
		System.out.println("wel come to Disk");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		Step1 s=new Step2();
		s.display();
		

	}

}
