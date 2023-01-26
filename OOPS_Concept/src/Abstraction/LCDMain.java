package Abstraction;

import java.util.Scanner;

public class LCDMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the LCD Brand name...");
		System.out.println("Enter the price...");
		LCD1 l1=new LCD1();
		l1.setName(sc.next());
		l1.setPrice(sc.nextInt());
		System.out.println(l1.getName()+" name...."+l1.getName());
		System.out.println(l1.getName()+ "price..."+l1.getPrice());
		LCD l=new LCD1();
		l.Processer();
		l.TuachSreen();
		l.multiLed();
		l.Display();

	}

}
