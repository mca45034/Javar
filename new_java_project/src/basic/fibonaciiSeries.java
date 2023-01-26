package basic;

import java.util.Scanner;

public class fibonaciiSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int a=0,b=1,sum;
		System.out.print(a+" "+b);
		for(int i=2;i<=num;i++) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum);
		}
		sc.close();
	}

}
