package dec_19th_assigment;

import java.util.Scanner;

public class countAnyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		//int num=3456;
		int count=0;
		while(num>0) {
		 int rem=num%10;
		 count++;
		 num=num/10;
		}
		System.out.println(count);
	}

}
