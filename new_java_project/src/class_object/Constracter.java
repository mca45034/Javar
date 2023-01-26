package class_object;

public class Constracter {
	String itam_name;
	String brand;
	int price;
	int quantity;
	Constracter(){
		itam_name="pencile";
		price=10;
	}
	Constracter(String a){
		brand=a;
	}
	Constracter(int b){
		quantity=b;
	}
	void display() {
		System.out.println(itam_name);
		System.out.println(price);
	}
	void a_display() {
		System.out.println(brand);
	}
	void b_display() {
		System.out.println(quantity);
	}

	public static void main(String[] args) {
		Constracter c= new Constracter();
		Constracter c1=new Constracter("natraj");
		Constracter c2=new Constracter(100);
		c.display();
		c1.a_display();
		c2.b_display();

	}

}
