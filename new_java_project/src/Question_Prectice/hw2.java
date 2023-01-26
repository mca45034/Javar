package Question_Prectice;

import java.util.Scanner;

public class hw2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the car number:");
		int num=sc.nextInt();
		int sum=0;
		if(num>=1000 && num<=10000) {
			if(num !=0) {
				num=num/10;
				sum=sum%10;
			}
			if(num%3==0 || num%5==0 || num%7==0) {
				System.out.println("lucky number");
			}
			else
				System.out.println("Not lucky number");
		}
		sc.close();
	}

}
