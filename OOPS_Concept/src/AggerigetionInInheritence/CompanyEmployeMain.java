package AggerigetionInInheritence;

import java.util.Scanner;

public class CompanyEmployeMain {
	static String c="-----WELCOME TO COMPANY-----";

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the company name : ");
		String name=sc.next();
		System.out.println("Enter the compant department : ");
		String dep=sc.next();
		System.out.println("Enter the Employe name : ");
		String e_name=sc.next();
		System.out.println("Enter the Employe Id : ");
		int e_id=sc.nextInt();
		System.out.println("Enter the Employe department : ");
		String e_dep=sc.next();
		System.out.println(c);
		Company c= new Company();
		c.setC_name(name);
		c.setC_department(dep);
		Employe em=new Employe();
		c.setE(em);
		c.getE().setE_name(e_name);
		c.getE().setE_id(e_id);
		c.getE().setE_department(e_dep);
		System.out.println("The company name is : "+c.getC_name());
		System.out.println("The Compant department is : "+c.getC_department());
		System.out.println("The employe name is : "+em.getE_name());
		System.out.println("The employe Id is : "+em.getE_id());
		System.out.println("The employe department is : "+em.getE_department());
	}

}
