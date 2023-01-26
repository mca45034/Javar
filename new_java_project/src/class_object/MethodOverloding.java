package class_object;

public class MethodOverloding {
	void cal(int a,int b) {
		System.out.println(a+b);
	}
	void cal(int a,int b, int c) {
		System.out.println(a+b*c);
	}
	void cal(int a,int b,int c,int d){
		System.out.println(a*b - - c*d);
	}
	public static void main(String[] args) {
		MethodOverloding m=new MethodOverloding();
		m.cal(10,30);
		m.cal(20, 40, 80);
		m.cal(50, 60, 70, 90);
	}

}
