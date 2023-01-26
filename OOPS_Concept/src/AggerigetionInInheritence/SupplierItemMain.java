package AggerigetionInInheritence;

import java.util.Scanner;

public class SupplierItemMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the suppleir Id : ");
		int id=sc.nextInt();
		System.out.println("Enter the suppleir name : ");
		String name=sc.next();
		System.out.println("Enter the Item name : ");
		String i_name=sc.next();
		System.out.println("Enter the Item price : ");
		int price=sc.nextInt();
		Supplier s=new Supplier();
		s.setS_id(id);
		s.setS_name(name);
		Item i=new Item();
		s.setI(i);
		s.getI().setI_name(i_name);
		s.getI().setPrice(price);
		System.out.println("Supplier id..."+s.getS_id());
		System.out.println("Supplier name ..."+s.getS_name());
		System.out.println("Item name.."+i.getI_name());
		System.out.println("Item price.."+i.getPrice());

	}

}
