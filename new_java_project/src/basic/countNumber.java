package basic;

import java.util.Scanner;

public class countNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. : ");
		int num = sc.nextInt();
		int count=0;
		while(num>0) {
		 int rem=num%10;
		 count++;
		 num=num/10;
		}
		System.out.println(count);

	}

}
