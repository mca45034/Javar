package Assigment_28Dec1;

import java.util.Scanner;

import Assigment_28Dec1.BookDetails;

public class BookDetailMain {
	public static void main(String[] args) {
		BookDetails b=new BookDetails();
		b.setBookName("Java");
		b.setBookPrice(500);
		b.setAuthorName("Eintein");
		System.out.println("Book Details");
		System.out.println("Book Name:"+b.getBookName());
		System.out.println("Book Price:"+b.getBookPrice());
		System.out.println("Author Name:"+b.getAuthorName());
		
		

	}


}
