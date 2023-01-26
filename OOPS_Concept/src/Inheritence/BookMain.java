package Inheritence;

import java.util.Scanner;

public class BookMain {

	static Book  Details() {
		Book b=new Book();
		b.setB_name("Rat ka Chand");
		b.setAuthor_name("Sham Shingh");
		b.setPrice(300);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Book name : ");
//		b.setB_name(sc.next());
//		System.out.println("Enter the Author name : ");
//		b.setAuthor_name(sc.next());
//		System.out.println("Enter the Book price : ");

		return b;

	}

}
