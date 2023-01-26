package Mini_Project;

import java.util.Scanner;

interface Showing3 {
	public static final String name="Showing_Books";
	static void display() {
		System.out.println(name);
	}
	void Show();

}
class Books implements Showing3{
	Scanner sc=new Scanner(System.in);

	@Override
	public void Show() {
		System.out.println("Stream you want");
		System.out.println("1..Mechenical");
		System.out.println("2..Softwere");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: 
			void_dis1();
			break;
		case 2:
			void_dis2();
		}
				
		
	}
	 void void_dis1() {
		System.out.println("Mechenical Branch");
		System.out.println("Machinery's Handbook. ...");
		System.out.println("Materials Science and Engineering....");
		System.out.println("Standard Handbook of Machine Design. ...");
	}
	 void void_dis2() {
		 System.out.println("C");
			System.out.println("JAVA");
			System.out.println("C++");
			System.out.println(".net");
	 }
	
}

