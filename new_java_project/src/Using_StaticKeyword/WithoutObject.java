package Using_StaticKeyword;

public class WithoutObject {
	int x=500;
	static int y=1500;
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	static void key() {
	System.out.println("printing the value of a and b");
	key2();
	}
	static void key2() {
		System.out.println("Withoiut object statc keyword run program");
	}

	public static void main(String[] args) {
		
		System.out.println(WithoutObject.y);
		WithoutObject.key();
		float a=3.0f;
		float b=4.0f;
		System.out.println(Math.pow(a, b));
		

	}

}
