package Interface;

import java.util.Scanner;

public class PhoneMainGetSet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Brand name..");
		System.out.println("Enter the price....");
//          Phone p=new SmartPhone();
//          p.Facelock();
//          p.Foldeble();
//          p.TuachScreen();
          SmartPhone p1=new SmartPhone();
          p1.setP_name(sc.next());
          p1.setP_price(sc.nextInt());
          System.out.println("SmartPhone price is...."+p1.getP_price());
          System.out.println("SmartPhone Brand Name Is ..."+p1.getP_name());
          Phone p=new SmartPhone();
          p.Facelock();
          p.Foldeble();
          p.TuachScreen();

	}

}
