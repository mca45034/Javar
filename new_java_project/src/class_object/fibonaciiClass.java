package class_object;

import java.util.Scanner;

public class fibonaciiClass {
	void sries(int num) {
		int a=0,b=1;
		System.out.println(a+" "+b);
		for(int i=2;i<=num;i++) {
			int sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum);
		}          
		
	}

	public static void main(String[] args) {
		fibonaciiClass m=new fibonaciiClass();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		m.sries(num);

	}

}
