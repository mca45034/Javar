package class_object;
class mix {
	String vihcale;
	String metal;
	String tyres;
	void print() {
		System.out.println("bike and bicycle are ..:"+vihcale);
		System.out.println("bike and bicycle metal...:"+metal);
		System.out.println("bike and tyres....:"+tyres);
	}
	
}

public class bicyclebike {

	public static void main(String[] args) {
		bicycle s=new bicycle();
		bik1 m=new bik1();
		mix n=new mix();
		s.print();
		System.out.println("------------------------------");
		m.print1();
		System.out.println("------------------------------");
		n.vihcale="Two And Four Will";
		n.metal="metal are type";
		n.tyres="air tube";
		n.print();
		

	}

}
