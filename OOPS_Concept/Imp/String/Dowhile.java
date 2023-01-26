package String;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int balance=10000;
		String str;
		do {
			System.out.println("Enter the amount..");
			int amt=sc.nextInt();
			balance=balance+amt;
			System.out.println("You want to continue yes/no.");
			str=sc.next();
			
		}while(str.equalsIgnoreCase("yes"));
		System.out.println("Your balance is..."+balance);

	}

}
