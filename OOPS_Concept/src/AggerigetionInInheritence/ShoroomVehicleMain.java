package AggerigetionInInheritence;

import java.util.Scanner;

public class ShoroomVehicleMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Shoroom name : ");
		String name=sc.next();
		System.out.println("Enter the shoroom Addrese : ");
		String add=sc.next();
		System.out.println("Enter the shoroom contect number : ");
        int cont=sc.nextInt();
        System.out.println("Enter the vehicle name : ");
        String vehicle=sc.next();
        System.out.println("Enter the type of vehicle : ");
        String typ=sc.next();
        System.out.println("Enter the vehicle model : ");
        int model=sc.nextInt();
        System.out.println("Enter the vehicle price : ");
        int price=sc.nextInt();
        Shoroom sm=new Shoroom();
        sm.setS_name(name);
        sm.setS_addrese(add);
        sm.setS_contectNo(cont);
        Vehicle vl=new Vehicle();
        sm.setV(vl);
        sm.getV().setV_name(vehicle);
        sm.getV().setV_type(typ);
        sm.getV().setV_model(model);
        sm.getV().setV_price(price);
        System.out.println("Shoroom name is : "+sm.getS_name());
        System.out.println("Shoroom addrese is : "+sm.getS_addrese());
        System.out.println("Shoroom contect number : "+sm.getS_contectNo());
        System.out.println("The vehicle name is : "+vl.getV_name());
        System.out.println("The vehicle type : "+vl.getV_type());
        System.out.println("The vehicle model : "+vl.getV_model());
        System.out.println("The vehicle price is : "+vl.getV_price());
  }

}
