package Assigment_7Jun;

import java.util.Scanner;

public class Assigment_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of course:");
		int size=sc.nextInt();
		System.out.println("Enter course names:");
		String[] strAr=new String[size];
		int flage=0;
		for(int i=0;i<size;i++) {
			strAr[i]=sc.next();
		}
	 	System.out.println("Searchin the the course : ");
		String m=sc.next();

		for(int i=0;i<size;i++) {
			
		if(strAr[i].equalsIgnoreCase(m)) {
			flage=1;
			break;
		}
		
	}
		if(flage==1) {
			System.out.println(" Course available");
		}
		else 
			System.out.println("Course is not Available");
		
  }
}

