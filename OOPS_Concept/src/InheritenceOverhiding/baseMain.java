package InheritenceOverhiding;
class Base {
	void display() {
		System.out.println("There are Base class");
	}
}
class Base2 extends Base{
	void display() {
		super.display();
		System.out.println("There are Base1 class");
	}
	void show() {
		
	}
}

public class baseMain {

	public static void main(String[] args) {
		Base2 b=new Base2();
		b.display();
		b.show();

	}

}
