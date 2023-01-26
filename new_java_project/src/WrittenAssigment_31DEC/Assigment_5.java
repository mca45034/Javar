package WrittenAssigment_31DEC;

import java.util.Scanner;

public class Assigment_5 {
	int area;
	int rectangle,length,breath,a;
	public void Area(int a) {
		area=a*a;
		
	}
	void display() {
		System.out.println(area);
	}
	public void Rectangle(int length,int breath) {
		rectangle=length*breath;
		 display();
		displayr();
	}
	void displayr() {
		System.out.println(rectangle);
	}

	public static void main(String[] args) {
		Assigment_5 as=new Assigment_5();
		Scanner sc=new Scanner(System.in);
		//Assigment_5 as=new Assigment_5();
		System.out.println("Enter the value of Area = ");
		int a=sc.nextInt();
		as.Area(a);
		System.out.println("Enter the Rectangle are length = ");
		int l=sc.nextInt();
		System.out.println("Enter the Rectangle are breath = ");
		int b=sc.nextInt();
		as.Rectangle(l, b);
		
		

	}
}
