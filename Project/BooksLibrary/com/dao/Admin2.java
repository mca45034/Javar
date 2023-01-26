package com.dao;

import java.util.Scanner;



public interface Admin2 {
	public static final String name="Wel come to Library";
	default void show1() {
		System.out.println(name);
	}
	void add();
	void delete();
	void show();
	void search();
	
}
class admmin implements Admin2{
	 Scanner sc=new Scanner(System.in);
		@Override
		public void add() {
			System.out.println("-----Books Adding-----");
			System.out.println("COMPILER DISEGN");
			System.out.println("Soft Skill");
			System.out.println("DATA STRACTURE");
			System.out.println("CLOUD COMPUTING");
			
			 
		}

		@Override
		public void delete() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void show() {
			System.out.println("Electronic");
			System.out.println("Singal Processing");
			System.out.println("Power System");
			System.out.println("Digital Design");
			
			
		}

		@Override
		public void search() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of books");
				int size=sc.nextInt();
				System.out.println("Enter the books..");
				String num[]=new String[size];
				for(int i=0;i<size;i++) {
				num[i]=sc.next();
				}
					for(int i=0;i<size;i++) {
					    System.out.println("My choice books "+num[i]);
					}	
					System.out.println("-------AVAILEBLER HERE------");
			
		}
		
	}







