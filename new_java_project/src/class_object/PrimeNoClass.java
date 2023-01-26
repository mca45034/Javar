package class_object;

import java.util.Scanner;

public class PrimeNoClass {
	void prime(int num) {
		int flage=0;
		int count=0;
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				flage=1;
				count++;
			}
		}
		if(flage==0) {
			System.out.println("Prime Number ");
		}
		else 
			System.out.println("Not Prime");
	}

	public static void main(String[] args) {
		 PrimeNoClass prime=new  PrimeNoClass();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number:");
		 int num=sc.nextInt();
		 prime.prime(num);
		

	}

}
