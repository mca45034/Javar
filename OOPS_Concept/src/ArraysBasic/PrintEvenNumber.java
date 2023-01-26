package ArraysBasic;

import java.util.Scanner;

public class PrintEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the number");
		int num[]=new int[size];
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=1;i<size;i=i+2) {
			System.out.println(num[i]);
		}

	}

}
