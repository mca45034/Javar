package Assigment_7Jun;

import java.util.Scanner;

public class Assigment_5Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person p=new Person();
		System.out.println("Enter the passenger name : ");
		String name=sc.next();
		System.out.println("Enter the gender(M or F / m or f):");
		char ch=sc.next().charAt(0);
		//p.setGender(sc.next().charAt(0));
		System.out.println("Enter the age : ");
		int age=sc.nextInt();
		//p.setAge(sc.nextInt());
		System.out.println("Enter the ticket no: ");
		Bus b=new Bus();
		b.setTicketNo(sc.nextInt());
		System.out.println("Enter the ticket price:");
		b.setTicketPrice(sc.nextInt());
		b.setPerson(p);
		b.getP().setName(name);
		b.getP().setGender(ch);
		b.getP().setAge(age);
		float totalprice1=b.getTotalAmount1();	
		
		//System.out.println("Passenger name is : "+p.getName());
		//System.out.println("Gender is : "+p.getGender());
		//System.out.println("Passenger Age is  : "+p.getAge());
		//System.out.println("The Ticket Number is : "+b.getTicketNo());
		//System.out.println("The Ticket price is : : "+b.getTicketPrice());
		if(totalprice1 >=16) {
			totalprice1=totalprice1-totalprice1*0.5f;
			System.out.println(totalprice1);
		}
		else if(totalprice1 >=60) {
			totalprice1=totalprice1-totalprice1*0.25f;
			System.out.println(totalprice1);
		}
		else if(totalprice1 >=80) {
			totalprice1=totalprice1-totalprice1*0.02f;
			System.out.println(totalprice1);
		}
		else
		{
			System.out.println("Please try again");
		}
		System.err.println("-------------------------------");
		System.err.println("--------------------------------");
		System.out.println("The Ticket Number is : "+b.getTicketNo());
		System.out.println("Passenger name is : "+p.getName());
		System.out.println("The Ticket price is : "+b.getTicketPrice());
		System.out.println("Discount after Total Amount :"+totalprice1);
	}

		
		
	}


