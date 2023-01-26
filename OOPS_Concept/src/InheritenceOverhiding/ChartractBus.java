package InheritenceOverhiding;

import java.util.Scanner;

class CharterLine {
	void display(String s) {
		System.out.println("Wel come to Chartract Bus"+s);
	}
	void discount() {
		System.out.println("Chartract Bus servise New year Providind discount");
	}
}
class  CharteAcBus extends CharterLine {
	float price=0;
	void discount () {
		Scanner sc=new Scanner(System.in);
		super.discount();
		System.out.println("1..Indore to Delhi........2500");
		System.out.println("2..Indore to Haridwar......4000");
		System.out.println("Enter your choice..");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			price=2500;
			cal_ticketDiscount();
			break;
		case 2:
			price=4000;
			cal_ticketDiscount();
		    break;
		}
		
	}


void cal_ticketDiscount(){
	System.out.println("Providing discount 5%");
	price=price-price*0.05f;
	System.out.println("discount after tecket price");
	System.out.println("THANK YOU HAVE A NICE JAURNIY");
}
}
class CharterNonAcBus extends CharterLine {
	float price=0;
	void discount() {
		Scanner sc=new Scanner(System.in);
		super.discount();
		System.out.println("1..Indore to Delhi.......1500");
		System.out.println("2..Indore to Haridwar.....2500");
		System.out.println("Enter your choice..");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			price=1500;
			cal_ticketDiscount1();
			break;
		case 2:
			price=2500;
			cal_ticketDiscount1();
			break;
			
		}	
	}

void cal_ticketDiscount1() {
	System.out.println("providing discount 7%..");
	price=price-price*0.07f;
	System.out.println("discount after tecket price..");
	System.out.println("THANK YOU HAVE A NICE JAURNIY");
}
}

public class ChartractBus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. CharteAcBus");
		System.out.println("2.CharterNonAcBus");
		System.out.println("Enter your choice..");
		String s=sc.next();
		CharterLine cl;
		if(s.equalsIgnoreCase("CharteAcBus")) {
			cl=new CharteAcBus();
			cl.discount();
			cl.display("Charte Ac Bus");
		}
		else
		{
			cl=new CharterNonAcBus();
			cl.discount();
			cl.display("Charter Non Ac Bus");
		}
	}

}

