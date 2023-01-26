package Assigment_14JAN;

import java.util.Scanner;

public class DepEmpDateMain_6 {

	public static void main(String[] args) {
		Department d[]=new Department[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<d.length;i++) {
			System.out.println("Enter Department ID");
			int did=sc.nextInt();
			System.out.println("Enter Department name");
			String dname=sc.next();
			System.out.println("Enter the day date");
			int day=sc.nextInt();
			System.out.println("Enter the Month");
			int month=sc.nextInt();
			System.out.println("Enter the year");
			int year=sc.nextInt();
			System.out.println("Enter Employr ID");
			int e_id=sc.nextInt();
			System.out.println("Enter the Employe name");
			String e_name=sc.next();
			System.out.println("Enter the Salary");
			int salary=sc.nextInt();
			MyDate md=new MyDate(day, month, year);
			Employe e=new Employe(e_id, e_name, salary);
			d[i]=new Department(did, dname, md, e);
				
		}
		for(Department md:d) {
			System.out.println(md);
		}
		
		

	}

}
