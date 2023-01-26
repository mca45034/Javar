package Mini_Project;

import java.util.Scanner;

public class LibraryMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name=sc.next();
		System.out.println("Enter the Password : ");
		String password=sc.next();
		if(password.equalsIgnoreCase("India")) {
			//Scanner sc=new Scanner(System.in);
			System.out.println("1.. Please type...Books");
			System.out.println("2..Please type...Other");
			System.out.println("Enter your choice");
			String s=sc.next();
			
		
			if(s.equalsIgnoreCase("Books")) {
				Showing3 m;
				m=new Books();
				m.Show();
				
			}
			else {
				System.out.println("1.. Please type...OLD HISTORICAL BOOKS");
				System.out.println("2..Please type...Old  Stories");
				System.out.println("Enter your choice");
				int st=sc.nextInt();
				if(st==1) {
					GkBooks gk;
					gk=new GkBookss();
					gk.search();
					
				}
				else
				{
					BookGk bok;
					bok=new BookssGk();
					bok.serch2();
				}
				
			}
		}
			
			else {
				//Scanner sc=new Scanner(System.in);
				System.out.println("----WELCOME TO LIBRARY----");
				System.out.println("Enter the name");
				String name1=sc.next();
				System.out.println("Create admin password");
				int pass=sc.nextInt();
				System.out.println("Searching book ENTER -> 1");
				System.out.println("Show book ENTER -> 2");
				System.out.println("Adding book ENTER -> 3");
				System.out.println("DELETING book ENTER -> 4");
				System.out.println("Enter the choice..");
				int choice=sc.nextInt();
				admin1 ad;
				ad=new admmin();
				switch(choice) {
				case 1:
					ad.search();
				case 2:
					ad.show();
				case 3:
					ad.add();
				case 4:
					ad.delete();
				
				
				
				}
				
				
				
				
			}

	}

	
	}

	

