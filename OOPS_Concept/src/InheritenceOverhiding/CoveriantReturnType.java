package InheritenceOverhiding;
class Parent {
	Parent display() {
		System.out.println("I am parent class...");
		return this;
	}
	String show() {
		return "Show Methode";
	}
}
class Child extends Parent{
	Child display(){
		System.out.println(super.display());
		System.out.println("I am child Class..");
		return this;
	}
}

public class CoveriantReturnType {

	public static void main(String[] args) {
		Parent p=new Child();
		System.out.println(new Child().display().show());
		
		
	}

}
