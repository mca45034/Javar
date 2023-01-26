package Assigment_24Dec;

import java.util.Scanner;

public class Luck_Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		if(num>=1000 &&num<=10000) {
			if(num !=0) {
				num=num/10;
				sum=sum%10;
			}
			if(sum%3==0 || sum%5==0 || sum%7==0) {
				System.out.println("My Lucky Number");
			}
			else
				System.out.println("It IS Not My Lucky Number");
		}

	
	}

}
