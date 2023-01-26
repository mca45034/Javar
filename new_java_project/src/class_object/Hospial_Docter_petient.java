package class_object;
class fecilitiy {
	String fec;
	String fec1;
	String fec2;
	void print() {
		System.out.println("Fecilitiy Are :"+fec);
		System.out.println("Fecilitiy Are :"+fec1);
		System.out.println("Fecilitiy Are :"+fec2);
	}
}
public class Hospial_Docter_petient {
	public static void main(String[] args) {
		petient p=new petient();
		hospital h=new hospital();
		docter d=new docter();
		fecilitiy f=new fecilitiy();
		System.out.println("---------------------------------");
		p.print();
		System.out.println("----------------------------------");
		h.print();
		System.out.println("----------------------------------");
		d.print();
		System.out.println("----------------------------------");
		f.fec=": Sepret Room";
		f.fec1=": Modern Fecilitiy";
		f.fec2=": Moder Technic";
		f.print();
		System.out.println("----------------------------------");
	}
}
