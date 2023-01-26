package Assigment_ArraysMethod;

import java.util.Scanner;

public class Assigment_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size...");
		int size=sc.nextInt();
		Student s[]=new Student[size];
		for(int i=0;i<s.length;i++) {
			System.out.println("Enter Student id");
			int id=sc.nextInt();
			System.out.println("Enter Student name");
			String name=sc.next();
			System.out.println("Boolean ispecial");
//			String ispecial=sc.next();
//			System.out.println("Enter Course name");
			String cname=sc.next();
			System.out.println("Enter course fees");
			int fees=sc.nextInt();
			Course c=new Course(cname, fees);
			s[i]=new Student(id, name, null, c);
		}
		for(int i=0;i<s.length;i++) {
			//System.out.println(s[i]);
			if(s[i].c.fees>50000) {
				s[i].ispecial=true;
				System.out.println(s[i]);
				System.out.println("Student is speciale");
			}
		}

	}

}
