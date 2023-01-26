package Inheritence;
class Shoroom {
	String s_name;
	String s_address;
	int s_contect;
	public Shoroom(){
		
		
	}
	
	public Shoroom(String s_name, String s_address, int s_contect) {
		super();
		this.s_name = s_name;
		this.s_address = s_address;
		this.s_contect = s_contect;
	}

	public String toString() {
		return "SHoroom name is..."+s_name+"\n"+"Shorrom address is..."+s_address+"\n"+"Shoroom contect number is.."+s_contect;
	}	
}

class Car extends Shoroom{
	String c_name;
	int c_model;
	String c_fuel;
	String c_facility;
	public Car() {
		this("Honda", 2022, "petrol","All fec");
		
	}
	public Car(String c_name, int c_model, String c_fuel,
			String c_facility) {
		super("Hundai", "indore", 1234567890);
		this.c_name ="Suzuki";
		this.c_model = 2022;
		this.c_fuel = "Diesal";
		this.c_facility ="All Facility";
	}

	public String toString () {
		System.out.println(super.toString());
		return "Car name is..."+c_name+"\n"+"Car model is..."+c_model+"\n"+"Car fuel type is..."+c_fuel+"\n"+"Car fecility is.."+c_facility;
	}	
}
class Bike extends Shoroom {
	String b_name;
	int b_model;
	int price;
	public Bike () {
		this("Pulser", 2022, 120000);
	}
	public Bike(String s_name, int s_contect, int b_model) {
		super("balaji", "Bhopal",812021354);
		this.b_name = "Pulser";
		this.b_model = 2022;
		this.price = 120000;
	}
	public String toString() {
		System.out.println(super.toString());
		return "Bike name is..."+b_name+"\n"+"Bike model is..."+b_model+"\n"+"Bike price is..."+price;
	}
	
}


public class ShoroomCarBike {

	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c);
		System.out.println("-------------------------------------");
		Bike b=new Bike();
		System.out.println(b);
	}

}
