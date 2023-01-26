package incapsulation;

public class ConstructerOverloading {
	ConstructerOverloading(){
		this(30,40);
		System.out.println("i am default constructor");
	}
	ConstructerOverloading(int a){
		
		System.out.println("i am singal value constructer");
		System.out.println(a);
	}
	ConstructerOverloading(int b,int c){
		this(50);
		System.out.println("i am two value constructer");
		System.out.println(b+" "+c);
	}

	public static void main(String[] args) {
		ConstructerOverloading o=new ConstructerOverloading();

	}

}
