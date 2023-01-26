package class_object;
public class bike {
	int making_since=2022;
	float price=70000;
	int Bike_gear=5;
	int Bike_sitting_person=3;
	int bike_miledge=60;
	void  print_bike_data() {
		System.out.println("making since is :"+making_since);
		System.out.println("price is :"+price);
		System.out.println("bike gear  is :"+Bike_gear);
		System.out.println("bike sitting person is :"+Bike_sitting_person);
		System.out.println("bike miledge is :"+bike_miledge);
	}
	
	public static void main(String[] args) {
		
		bike man = new bike();
		man.print_bike_data();
		man.price=12000;
		man.Bike_gear=6;
		man.Bike_sitting_person=4;
		man.bike_miledge= 50;
		System.out.println("------");
		man.print_bike_data();
		
	}

}
