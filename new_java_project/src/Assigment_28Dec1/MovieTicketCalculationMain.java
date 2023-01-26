package Assigment_28Dec1;

import java.util.Scanner;

public class MovieTicketCalculationMain {

	public static void main(String[] args) {
		MovieTicketCalculation  m=new MovieTicketCalculation ();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the movies name : ");
		m.setMovieName(sc.next());
		System.out.println("Enter the movies category : ");
		m.setMovieCategory(sc.next());
		System.out.println("Enter the circle : ");
		String circle=sc.next();
		int price=m.calculationTicketCost1(circle);
		m.setTicketCost(price);
		System.out.println("movies name is : "+m.getMovieName());
		System.out.println("movie catrgory is : "+m.getMovieCategory());
		System.out.println("movies cost is : "+m.getTicketCost());
		
		

	}

}
