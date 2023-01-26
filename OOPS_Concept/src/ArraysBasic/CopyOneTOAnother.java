package ArraysBasic;

import java.util.Scanner;

public class CopyOneTOAnother {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the number");
		int number[]=new int [size];
		for(int i=0;i<size;i++) {
			number[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
		System.out.println(number[i]);}

	}

}
