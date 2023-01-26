package AggerigetionInInheritence;

import java.util.Scanner;

public class CafeCustomerMain {
	static String b="-----WELCOME TO MCA CHAI WALA-----";

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Cafe name : ");
		String name=sc.next();
		System.out.println("Enter the Cafe fecility : ");
		String fec=sc.next();
		System.out.println("Enter the Cafe charges : ");
		int charge=sc.nextInt();
		System.out.println("Enter the Customer name :" );
		String c_name=sc.next();
		System.out.println("Enter the Which types Of Coffie : ");
		String typecoffie=sc.next();
		System.out.println("Enter the Reviews : ");
		String reviews=sc.next();
		System.out.println(b);
		Cafe cf=new Cafe();
		cf.setC_name(name);
		cf.setC_fecility(fec);
		cf.setC_charge(charge);
		Customer c=new Customer();
		cf.setC(c);
		cf.getC().setName(c_name);
		cf.getC().setTypecoffie(typecoffie);
		cf.getC().setReviews(reviews);
		System.out.println("The Cafe name is : "+cf.getC_name());
		System.out.println("The Cafe fecility is : "+cf.getC_fecility());
		System.out.println("The Cafe charges is :"+cf.getC_charge() );
		System.out.println("Customer name is : "+c.getName());
		System.out.println("Coffie Choice : "+c.getTypecoffie());
		System.out.println("Coffie reviews is : "+c.getReviews());
		

	}

}
