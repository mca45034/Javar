package class_object;

public class ConstractCar {
	String product_name,brand,engine_type,break_type;
	int price,hp,seter;
	ConstractCar(){
		product_name="Car";
		brand="Honda";
		engine_type="HMT";
		hp=350;
		seter=7;
	}
	ConstractCar(String bt){
		break_type=bt;
	}
	ConstractCar(int p){
		price=p;	
	}
	void display() {
		System.out.println(product_name);
		System.out.println(brand);
		System.out.println(engine_type);
		System.out.println(hp);
		System.out.println(seter);
	}
	void bt_display() {
		System.out.println(break_type);
	}
	void p_display() {
		System.out.println(price);
	}
	public static void main(String[] args) {
		ConstractCar c=new ConstractCar();
		ConstractCar c1=new ConstractCar("oil machinical break");
		ConstractCar c2=new ConstractCar(1200000);
		c.display();
		c1.bt_display();
		c2.p_display();
	}

}
