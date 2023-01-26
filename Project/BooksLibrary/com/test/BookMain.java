package com.test;



//import java.util.Date;
//import java.util.Scanner;
//
//import com.dao.BookDetails;
//import com.pojo.Book;
//import com.pojo.Branch;
//
//public class BookMain {
//
//	public static void main(String[] args) {
//		int flag=0;
//		//Book book[]=new Book[3];
//		System.out.println("Branches");
//		System.out.println("1.Electrical");
//		System.out.println("2 I.T");
//		System.out.println("3 Mechanical");
//		System.out.println("4  Stories");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the branch");
//		String branch=sc.next();
//		Branch b=BookDetails.showElectrical();
//		Branch b1=BookDetails.showIT();
//		Branch b2=BookDetails.showMechanical();
//		Branch b3=BookDetails.showStories();
////		System.out.println("Enter book you want to select");
////		String book_name=sc.next();
//		BookDetails bd=new BookDetails();
//		if(b1.getBranch().equals(branch)) {
//			Book book5[]=b1.getB();
//			int i;
//			for(i=0;i<book5.length;i++) {
//				System.out.println(book5[i].getId()+" "+book5[i].getName()+" "+book5[i].getPrice());
//			}
//			System.out.println("Enter book you want to select");
//			String book_name=sc.next();
//			for( i=0;i<book5.length;i++)
//			{
//				if(book5[i].getName().equals(book_name))
//				{
//					flag=1;
//					break;		
//				}	
//			}
//			
//			if(flag==1)
//			{
//				System.out.println("Checking for avilablity");
//			}
//			else
//			{
//				System.out.println("sorry this book is not available");
//			}
//		
//			
//
//		}
//			
//		
//		if(b3.getBranch().equals(branch)) {
//			Book book4[]=b3.getB();
//			int i;
//			for(i=0;i<book4.length;i++) {
//				System.out.println(book4[i].getId()+" "+book4[i].getName()+" "+book4[i].getPrice());
//			}
//			System.out.println("Enter book you want to select");
//			String book_name=sc.next();
//			for( i=0;i<book4.length;i++)
//			{
//				if(book4[i].getName().equalsIgnoreCase(book_name))
//				{
//					flag=1;
//					break;		
//				}	
//			}
//			
//			if(flag==1)
//			{
//				System.out.println("Checking for avilablity");
//			}
//			else
//			{
//				System.out.println("sorry this book is not available");
//			}
//		
//			
//
//		}
//		if(b2.getBranch().equals(branch)) {
//			Book book3[]=b2.getB();
//			int i;
//			for(i=0;i<book3.length;i++) {
//				System.out.println(book3[i].getId()+" "+book3[i].getName()+" "+book3[i].getPrice());
//			}
//			System.out.println("Enter book you want to select");
//			String book_name=sc.next();
//			for( i=0;i<book3.length;i++)
//			{
//				if(book3[i].getName().equals(book_name))
//				{
//					flag=1;
//					break;		
//				}	
//			}
//			
//			if(flag==1)
//			{
//				System.out.println("Checking for avilablity");
//			}
//			else
//			{
//				System.out.println("sorry this book is not available");
//			}
//		
//			
//		}
//		
//		if(b1.getBranch().equals(branch))
//		{
//			Book book2[]=b1.getB();
//			int i;
//			for( i=0;i<book2.length;i++)
//			{
//				System.out.println(book2[i].getId()+" "+book2[i].getName()+" "+book2[i].getPrice());
//		}
//			System.out.println("Enter book you want to select");
//			String book_name=sc.next();
//
//			for( i=0;i<book2.length;i++)
//			{
//				if(book2[i].getName().equals(book_name))
//				{
//					flag=1;
//					break;		
//				}	
//			}
//			
//			if(flag==1)
//			{
//				System.out.println("Checking for avilablity");
//			}
//			else
//			{
//				System.out.println("sorry this book is not available");
//			}
//		
//		
//		}
//		if(b.getBranch().equals(branch))
//			{
//				Book[] book1=b.getB();
//				for(int i=0;i<book1.length;i++) {
//					System.out.println(book1[i].getId()+" "+book1[i].getName()+" "+book1[i].getPrice());
//		}
//				System.out.println("Enter book you want to select");
//				String book_name=sc.next();
//		int i;
//		for( i=0;i<book1.length;i++)
//		{
//			if(book1[i].getName().equals(book_name))
//			{
//				flag=1;
//				break;		
//			}	
//		}
//		
//		if(flag==1)
//		{
//			System.out.println("Checking for avilablity");
//		}
//		else
//		{
//			System.out.println("sorry this book is not available");
//		}
//	
//			
//		
//		System.out.println("how many copies you want");
//		int copies=sc.nextInt();
//		
//	book1[i].setNoOfCopeis(book1[i].getNoOfCopeis()-copies);
//	System.out.println(book1[i].getNoOfCopeis());
//			}
//		System.out.println("enter ur name");
//		String name=sc.next();
//		
//		Date d=new Date();
//		System.out.println(name +" ur book is booked on.."+d);
//		System.out.println("Plz return book within 7 days");
//	
//
//	}
//}
//
//
//
//
