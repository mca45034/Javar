package Assigment_ArraysMethod;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assigment_1Employe e[]=new Assigment_1Employe[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<e.length;i++) {
			System.out.println("Enter the Employee id");
			int e_id=sc.nextInt();
			System.out.println("Enter the Employee name");
			String e_name=sc.next();
			System.out.println("Enter the department id");
			int depid=sc.nextInt();
			System.out.println("Enter the department name");
			String depname=sc.next();
			Department dp=new Department(depid, depname);
			e[i]=new Assigment_1Employe(e_id, e_name, dp);
		}
		for(int i=0;i<e.length;i++) {
			System.out.println(e[i]);
		}

	}

}
