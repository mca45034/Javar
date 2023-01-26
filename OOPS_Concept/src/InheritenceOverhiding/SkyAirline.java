package InheritenceOverhiding;

import java.util.Scanner;

class Airline {
	void display(String s) {
		System.out.println("Wel come to..."+s);
	}
	void discount() {
		System.out.println("Airline privoiding discount...");
	}
}
class Indigo extends Airline{
	float price=0;
	void discount() {
		Scanner sc=new Scanner(System.in);
		super.discount();;
		System.out.println("1..Mumbai to Delhi......7000");
		System.out.println("2..Mubai to pune.......5000");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			price=7000;
			cal_discount();
			break;
		case 2:
			price=5000;
			cal_discount();
			break;
		}
	}
	void cal_discount() {
		System.out.println("We are 5% discount ");
		price =price-price*0.05f;
		System.out.println("After discount price");
		System.out.println("Thank you have a nice jaurnay");
	}
}
class AirArabia extends Airline{
	float price=0;
	void discount() {
		super.discount();
		Scanner sc=new Scanner(System.in);
		System.out.println("1..Delhi to Dubai......20000");
		System.out.println("2..Mubai to Karachi.......25000");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			price=20000;
			cal_discount();
			break;
		case 2:
			price=25000;
			cal_discount();
			break;
		}
	}
	void cal_discount() {
		System.out.println("We are 3% discount ");
		price =price-price*0.03f;
		System.out.println("After discount price");
		System.out.println("Thank you have a nice jaurnay");
	}
}

public class SkyAirline {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Indigo");
		System.out.println("2.Air Arabia");
		System.out.println("Enter yout choice");
		String s=sc.next();
		Airline al;
		if(s.equalsIgnoreCase("Indigo")) {
			al=new Indigo();
			al.display("Indigo Airline");
		    al.discount();
		}
		else
		{
			al=new AirArabia();
			al.display("Air Arabia Airline");
			al.discount();
		}
		

	}

}
