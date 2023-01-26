package Assigment_29DEC_StaticKeyword;

import java.util.Scanner;

public class ClassTicketMain {

	public static void main(String[] args) {
		ClassTicket ct=new ClassTicket();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of booking:");
		int number=sc.nextInt();
		System.out.println("Enter the available ticket:");
		ct.setAvailableTickets(sc.nextInt());
		do {
		System.out.println("Enter the ticket-ID:");
		ct.setTicketid(sc.nextInt());
		System.out.println("Enter the price:");
		ct.setPrice(sc.nextInt());
		System.out.println("Enter the no of ticket:");
		int tik=sc.nextInt();
		System.out.println("\nAvailable tickets:"+ct.getAvailableTickets());
	    System.out.println("\nTotal amount:"+ct.calculateTicket(tik));
	    System.out.println("\nAvailable ticket after booking:"+ct.getAvailableTickets());
		number--;
		}
		while(number>0);
		

	}

}
