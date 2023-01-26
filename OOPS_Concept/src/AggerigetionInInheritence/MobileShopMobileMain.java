package AggerigetionInInheritence;

import java.util.Scanner;

public class MobileShopMobileMain {

	public static void main(String[] args, String m_name, int m_ram, int m_rom, int m_price) {
		MobileShop ms=new MobileShop();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Shope name..");
		ms.setName(sc.next());
		System.out.println("Enter the shope number..");
		ms.setS_number(sc.nextInt());
		System.out.println("Enter the deller name..");
		ms.setD_name(sc.next());
		Mobile m=new Mobile();
		System.out.println("Enter the mobile name..");
		m.setM_name(sc.next());
		System.out.println("Enter the RAM of mobile..");
		m.setM_ram(sc.nextInt());
		System.out.println("Enter the ROM of mobile..");
		m.setM_ram(sc.nextInt());
		System.out.println("Enter the price of mobile..");
		m.setM_price(sc.nextInt());
		ms.setM(m);
		ms.getM().setM_name(m_name);
		ms.getM().setM_ram(m_ram);
		ms.getM().setM_rom(m_rom);
		ms.getM().setM_price(m_price);
		System.out.println("Shope name..."+ms.getName());
		System.out.println("Shope mobile number..."+ms.getS_number());
		System.out.println("Shope deller name..."+ms.getD_name());
		System.out.println("Mobile name..."+m.getM_name());
		System.out.println("Mobile RAM..."+m.getM_ram());
		System.out.println("Mobile ROM..."+m.getM_rom());
		System.out.println("Mobile price..."+m.getM_price());
		

	}

}
