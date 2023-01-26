package Using_StaticKeyword;

public class StaticVariable {
	int a=50;
	static int b=100;
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
	static void main() {
		//System.out.println(a);
		System.out.println(b);
		main2();
	}
	static void main2() {
		System.out.println("Non static variable");
		
	}

	public static void main(String[] args) {
		main();
		//main2();
		StaticVariable s=new StaticVariable();
		s.display();

	}

}
