package Arrays_Assigment;

import java.util.Scanner;

public class Assigment14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the number");
		int num[]=new int[size];
		int store = 0;
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=size-1;i>=0;i--) {
			if(num[i] !=0) {
				System.out.print(" "+num[i]);
			}
		}
		for(int i=size-1;i>=0;i--) {
			if(num[i]==0) {
				System.out.print(" "+num[i]);
			}
		}
	}
}
