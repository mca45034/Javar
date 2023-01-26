package InheritenceOverhiding;

import java.util.Scanner;

class Fectory{
	void display(String m) {
		System.out.println("WEL COME TO MILK FECTORY....");
	}
	void addwater() {
		System.out.println("Milk Fectory are without water of milk");
	}
}
class BuffaloMilk extends Fectory {
	float price=0;
	void addwater() {
		Scanner sc=new Scanner(System.in);
		super.addwater();
		System.out.println("1..7% mix water in milk....40");
		System.out.println("2..3% mix water in milk....55");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: 
			price=40;
			cal_addweter();
			break;
		case 2:
			price =55;
			cal_addweter();
			break;
		}
		
	}
void cal_addweter() {
	System.out.println("Adding the 0.05% mix water in the milk");
	price=price-price*0.02f;
	System.out.println("After the adding the water in tha milk");
	
}
}
class CowMilk extends Fectory {
	float price=0;
	void addwater () {
		Scanner sc=new Scanner(System.in);
		super.addwater();
		System.out.println("1..[3%] mix water in milk....20");
		System.out.println("2..[1.5%] mix water in milk...30");
		System.out.println("Enter your choice ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			price=20;
			cal_addwater();
			break;
		case 2:
			price=30;
			cal_addwater();
			break;
			
		}
	}

void cal_addwater() {
	System.out.println("Adding the 0.02% mix water in the milk");
	price=price-price*0.01f;
	System.out.println("After the adding the water in tha milk");
}
}

public class MilkFectory {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1..BuffaloMilk");
		System.out.println("2..CowMilk");
		System.out.println("Enter your choice");
		String s=sc.next();
	
		if(s.equalsIgnoreCase("BaffoleMilk")) {
			BuffaloMilk f=new BuffaloMilk();
			f.addwater();
			f.display("Baffole Milk");
		}
		else {
			CowMilk f=new CowMilk();
			f.addwater();
			f.display("COw milk ");
		}
		
	
		

	}

}
