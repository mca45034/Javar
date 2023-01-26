package InheritenceOverhiding;

import java.util.Scanner;

class Shoroom{
	void Display(String s) {
		System.out.println("--WEL COME TO DPS JEWELLARS--");
	}
	void addMixture() {
		System.out.println("5% of DIwali Dhamaka");
	}
	
}
class Silver extends Shoroom{
	float price=0;
	void addMxture() {
		Scanner sc=new Scanner(System.in);
		System.err.println("1..5% mix material ..........discount is 5%  40000");
		System.err.println("2..3% mix material ........discount is 2%   45000");
		System.out.println("Enter the Choice..");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			price=40000;
			calculate();
			break;
		case 2:
			price=45000;
			calculate1();
			break;
			
		}
	}
	void calculate() {
		System.out.println("Discount is 5%: "+price);
		price =price-price*0.05f;
		System.out.println("Afer discount is....: "+price);
		System.out.println("THANK YOU WEL COME TO NEXT TIME");
	}
	void calculate1() {
		System.out.println("Discount is 3%");
		price =price-price*0.03f;
		System.out.println("Afer discount is....: "+price);
		System.out.println("THANK YOU WEL COME TO NEXT TIME");
	}
	
}
class Gold extends Shoroom{
	float price=0;
	void addMixture() {
		Scanner sc=new Scanner(System.in);
		System.err.println("1..2% mixture and Discount is 4%...55000");
		System.err.println("2..0.1% mixture and Discount is 2%...60000");
		System.out.println("Enter the choice..");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			price=55000;
			Cal1();
			break;
		case 2:
			price=60000;
			Cal2();
			break;
			
		}
	}
	void Cal1() {
		System.out.println("Discount is 4%: "+price);
		price =price-price*0.04f;
		System.out.println("Afer discount is....: "+price);
		System.out.println("THANK YOU WEL COME TO NEXT TIME");
	}
	void Cal2() {
		System.out.println("Discount is 2%: "+price);
		price =price-price*0.02f;
		System.out.println("Afer discount is....: "+price);
		System.out.println("THANK YOU WEL COME TO NEXT TIME");
	}
}

public class GoldSelver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter your choice");
		System.err.println("Enter--(1)-- and --(2)--  ");
		System.out.println("1..Silver Price Details..");
		System.out.println("2..Gold Price Details..");
		String s=sc.next();
		Shoroom s1;
		if(s.equalsIgnoreCase("Selver")) {
			 s1=new Silver ();
			 s1.addMixture();
			 s1.Display("Silver");
			
		}
		else 
			s1=new Gold();
		    s1.addMixture();
		    s1.Display("Gold");

	}

}
