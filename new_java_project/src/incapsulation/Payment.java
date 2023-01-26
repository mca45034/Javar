package incapsulation;

import java.util.Scanner;

public class Payment {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Information i=new Information("Rahul", "Indore", 105,800 );
     i.print();
     System.out.println("Enter the coupen:");
     String s=sc.next();
     int p=i.getprice();
     if(s.equals("gold")){
    	 p=p-200;
    	 System.out.println("Price after discount.."+p);
     }
     else if(s.equals("selver")) {
    	p=p-50;
    	System.out.println("price after discount.."+p);
     }
     else
    	 System.out.println("price is.."+p);
     
	}

}
