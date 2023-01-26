package class_object;

import java.util.Scanner;

public class CountClass {
	void count(int num) {
		int count=0;
		while(num>0) {
			int rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		CountClass cc=new CountClass();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		cc.count(num);

	}

}
