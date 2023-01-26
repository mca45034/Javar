package class_object;

import java.util.Scanner;

public class Fact_Class {
	void calculation (int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Fact_Class f= new Fact_Class();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		f.calculation(num);

	}

}
