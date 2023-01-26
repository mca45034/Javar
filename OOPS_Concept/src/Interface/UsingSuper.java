package Interface;
interface xyz{
	default void xyz0() {
		System.out.println("I AM XYZ INTERFACE");
	}
}
interface xyzI{
	default void xyzi() {
		System.out.println("I AM XYZI INTERFACE");
	}
}
interface xyzII{
	default void xyzii() {
		System.out.println("I AM XYZII INTERFACE");
	}
}
class Adding implements xyz,xyzI,xyzII{
	public void Ram() {
		xyz.super.xyz0();
		xyzI.super.xyzi();
		xyzII.super.xyzii();
	}
	
}

public class UsingSuper {

	public static void main(String[] args) {
		Adding a=new Adding();
		a.Ram();
		

	}

}
