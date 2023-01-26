package Assigment_14JAN;

import java.util.Scanner;

public class Assigment_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of elements in the first array :");
		int size=sc.nextInt();
		System.out.println("Enter the size of elements in the first array :");
		int num1[]=new int[size];
		for(int i=0;i<size;i++) {
			num1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of elements in the Second array :");
		int size1=sc.nextInt();
		System.out.println("Enter the number of elements in the secound array :");
		int num2[]=new int[size1];
		for(int i=0;i<size1;i++) {
			num2[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			num1[i]=num2[i];
			System.out.print(" "+num2[i]);
		}
		for(int j=0;j<size1;j++) {
			num2[j]=num1[j];
			System.out.print(" "+num1[j]);
		}

	}

}
