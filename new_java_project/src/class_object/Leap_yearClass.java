package class_object;

import java.util.Scanner;

public class Leap_yearClass {
	void leap(int year) {
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0))	
	    {
	    	System.out.println("This Is A Leap Year");
	    }
	    else System.out.println("This Is Not Leap Year");
	}

	public static void main(String[] args) {
		Leap_yearClass l=new Leap_yearClass();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		l.leap(year);

	}

}
