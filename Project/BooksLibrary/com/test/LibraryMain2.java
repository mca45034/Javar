package com.test;

import java.util.Scanner;
import java.util.Date;
import java.util.Scanner;

import com.dao.BookDetails;
import com.pojo.Book;
import com.pojo.BookAdmin;
import com.pojo.Branch;

public class LibraryMain2 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name=sc.next();
		System.out.println("Enter the Password : ");
		String password=sc.next();
		if(password.equalsIgnoreCase("India")) {

			int choice;
			int count=0,flag=0;
			BookAdmin b[]=new BookAdmin[10];
			
			while(true)
			{
				System.out.println("1.Adding book...");
				
				
				
				System.out.println("2.Updating book..");
				System.out.println("3.Deleting book...");
				
				System.out.println("4.Searching book...");
				System.out.println("5.Geting all...");
				
				System.out.println("6.exit...");
				System.out.println("7.Insert  book...");
				System.out.println(" ");
				
				
				System.out.println("Enter the choice:");
				choice=sc.nextInt();
				
				
				switch(choice)
				{
				
				case 1:
					System.out.println("add book:");
					System.out.println("enter the no of book to enter:");
					int size=sc.nextInt();
					
					
					for(int i=0; i<size; i++)
					{
						System.out.println("enter the bookid:");
						int bookid=sc.nextInt();
						
						
						System.out.println("enter the bookname :");
						String bookname=sc.next();
			
						
						
						
						
						System.out.println("enter the book authorname for update:");
						String authorname=sc.next();
						
						System.out.println("enter the book prize for update:");
						int prize=sc.nextInt();
						
						b[i]=new BookAdmin(bookid,bookname,authorname,prize);
						count++;
						
						
					}
					System.out.println("Add book successfull :");
					break;
				
				case 2:
					System.out.println("2.update book:");
					System.out.println("enter the book id for update:");
					int bookid=sc.nextInt();
					for(int i=0;i<count;i++) 
					{
						if(b[i]!=null&&b[i].getBookid()==bookid)
						{
							System.out.println("enter the bookname for update:");
							String bookname=sc.next();
							
							b[i].setBookname(bookname);
							System.out.println("enter the book authorname for update:");
						String authorname=sc.next();
							b[i].setAuthorname(authorname);
							System.out.println("enter the book prize for update:");
							int prize=sc.nextInt();
							b[i].setPrize(prize);
							
						}
					}
					System.out.println("book update successfully:");
					break;
					
				case 3:
				
					System.out.println("delete book:");
					System.out.println("enter the bookid for delete:");
					bookid=sc.nextInt();
					for(int i=0;i<count;i++)
					{
						if(b[i]!=null&&b[i].getBookid()==bookid)
						{
							b[i]=null;
						}
					}
				
					System.out.println("delete book successfully:");
					break;
				
					case 4:
					
					{
						int i;
						System.out.println("search book:");
						System.out.println("enter the bookid for search :");
						bookid=sc.nextInt();
	                    System.out.println("bookid  "+"\t"+"bookname  "+"\t"+"author name  "+"\t"+"prize  ");
						for( i=0;i<count;i++)
						{
							if(b[i]!=null &&b[i].getBookid()==bookid)
							{
								flag=1;
								
								
							}
						}
						if(flag==1)
						{
							System.out.println(b[i]);
						}
						else
							System.out.println("Book id is not present");
						System.out.println("search completed:");
						break;
					}
					
					
					case 5:
					
						System.out.println("all info book:");
						
						System.out.println("all book are:");
						System.out.println("bookid  "+"\t"+"bookname  "+"\t"+"author name  "+"\t"+"prize  ");			
						for(int i=0;i<count;i++)
						{
						
							if(b[i]!=null)
							{
								
								
						System.out.println(b[i]);	
								
									
						}
						}
						
						System.out.println("all book are this:");
						break;
						
						
					case 6:
						System.exit(0);
						
						
						default:
							System.out.println("enter right choice:");
				
							
						case 7:
							for(int i=count;i<count+1;i++)
							{
								System.out.println("enter the bookid:");
							bookid=sc.nextInt();
							
							
							System.out.println("enter the bookname :");
							String bookname=sc.next();
				
							System.out.println("enter the book authorname for update:");
							String authorname=sc.next();
							
							System.out.println("enter the book prize for update:");
							int prize=sc.nextInt();
							
							b[i]=new BookAdmin(bookid,bookname,authorname,prize);	
							}
							count++;	
				}				
			}			
			}
			else {
				System.out.println("--YOU ARE NEW USER--");
				System.out.println("---WEL COME TO SHRI LIBRARY---");
				int flag=0;
				//Book book[]=new Book[3];
				System.out.println("Please Select Branches");
				System.out.println("1.Electrical");
				System.out.println("2 I.T");
				System.out.println("3 Mechanical");
				System.out.println("4  Stories");
	
				System.out.println("Enter the branch");
				String branch=sc.next();
				Branch b=BookDetails.showElectrical();
				Branch b1=BookDetails.showIT();
				Branch b2=BookDetails.showMechanical();
				Branch b3=BookDetails.showStories();

				BookDetails bd=new BookDetails();
				if(b1.getBranch().equals(branch)) {
					Book book5[]=b1.getB();
					int i;
					for(i=0;i<book5.length;i++) {
						System.out.println(book5[i].getId()+" "+book5[i].getName()+" "+book5[i].getPrice());
					}
					System.out.println("Enter book you want to select");
					String book_name=sc.next();
					for( i=0;i<book5.length;i++)
					{
						if(book5[i].getName().equals(book_name))
						{
							flag=1;
							break;		
						}	
					}
					
					if(flag==1)
					{
						System.out.println("Checking for avilablity");
					}
					else
					{
						System.out.println("sorry this book is not available");
					}
				
					

				}
					
				
				if(b3.getBranch().equals(branch)) {
					Book book4[]=b3.getB();
					int i;
					for(i=0;i<book4.length;i++) {
						System.out.println(book4[i].getId()+" "+book4[i].getName()+" "+book4[i].getPrice());
					}
					System.out.println("Enter book you want to select");
					String book_name=sc.next();
					for( i=0;i<book4.length;i++)
					{
						if(book4[i].getName().equalsIgnoreCase(book_name))
						{
							flag=1;
							break;		
						}	
					}
					
					if(flag==1)
					{
						System.out.println("Checking for avilablity");
					}
					else
					{
						System.out.println("sorry this book is not available");
					}
				
					

				}
				if(b2.getBranch().equals(branch)) {
					Book book3[]=b2.getB();
					int i;
					for(i=0;i<book3.length;i++) {
						System.out.println(book3[i].getId()+" "+book3[i].getName()+" "+book3[i].getPrice());
					}
					System.out.println("Enter book you want to select");
					String book_name=sc.next();
					for( i=0;i<book3.length;i++)
					{
						if(book3[i].getName().equals(book_name))
						{
							flag=1;
							break;		
						}	
					}
					
					if(flag==1)
					{
						System.out.println("Checking for avilablity");
					}
					else
					{
						System.out.println("sorry this book is not available");
					}
				
					
				}
				
				if(b1.getBranch().equals(branch))
				{
					Book book2[]=b1.getB();
					int i;
					for( i=0;i<book2.length;i++)
					{
						System.out.println(book2[i].getId()+" "+book2[i].getName()+" "+book2[i].getPrice());
				}
					System.out.println("Enter book you want to select");
					String book_name=sc.next();

					for( i=0;i<book2.length;i++)
					{
						if(book2[i].getName().equals(book_name))
						{
							flag=1;
							break;		
						}	
					}
					
					if(flag==1)
					{
						System.out.println("Checking for avilablity");
					}
					else
					{
						System.out.println("sorry this book is not available");
					}
				
				
				}
				if(b.getBranch().equals(branch))
					{
						Book[] book1=b.getB();
						for(int i=0;i<book1.length;i++) {
							System.out.println(book1[i].getId()+" "+book1[i].getName()+" "+book1[i].getPrice());
				}
						System.out.println("Enter book you want to select");
						String book_name=sc.next();
				int i;
				for( i=0;i<book1.length;i++)
				{
					if(book1[i].getName().equals(book_name))
					{
						flag=1;
						break;		
					}	
				}
				
				if(flag==1)
				{
					System.out.println("Checking for avilablity");
				}
				else
				{
					System.out.println("sorry this book is not available");
				}
			
					
				
				System.out.println("how many copies you want");
				int copies=sc.nextInt();
				
			book1[i].setNoOfCopeis(book1[i].getNoOfCopeis()-copies);
			System.out.println(book1[i].getNoOfCopeis());
					}
				System.out.println("enter ur name");
				String name1=sc.next();
				
				Date d=new Date();
				System.out.println(name1 +" ur book is booked on.."+d);
				System.out.println("Plz return book within 7 days");
			
				
			}
	}

}

