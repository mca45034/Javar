package AggerigetionInInheritence;

import java.util.Scanner;

public class ShoromClothesMain {
    static String name="--Raymand Shorom--";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Shorom name..");
		Shorom s=new Shorom();
		s.setS_name(sc.next());
		System.out.println("Enter Shorom Address..");
		s.setS_location(sc.next());
		System.out.println("Enter Shorom contect number....");
		s.setS_contect(sc.nextInt());
		System.out.println("Cloath brand...");
		String b=sc.next();
		System.out.println("Clothes manufacture....");
		String m=sc.next();
		Clothes c=new Clothes();
		s.setC(c);
		c.setC_brand(b);
		c.setC_manufature(m);
		s.getC().setC_brand(b);
		s.getC().setC_manufature(m);
		System.err.println(name);
		
		System.out.println("Shorom name is.."+s.getS_name());
		System.out.println("Shorom Address is.."+s.getS_location());
		System.out.println("Shorom contect number is.."+s.getS_contect());
		System.out.println("Clothes Brand is.."+c.getC_brand());
		System.out.println("Clothes manufactures is.."+c.getC_manufacture());

	}

}
