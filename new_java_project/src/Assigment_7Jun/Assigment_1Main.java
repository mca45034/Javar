package Assigment_7Jun;

import java.util.Scanner;

public class Assigment_1Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number Of USB port..");
		System.out.println("Enter the Processor Speed...");
		Assigment_1 a=new Assigment_1();
		a.setNoOfUSBPort(sc.nextInt());
		a.setProcessorSpeed(sc.nextInt());
		System.out.println("The Number Of USB Port : "+a.getNoOfUSBPort());
		System.out.println("Thre Are Processor Speed : "+a.getProcessorSpeed());

	}

}
