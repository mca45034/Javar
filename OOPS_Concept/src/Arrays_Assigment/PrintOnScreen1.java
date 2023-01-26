package Arrays_Assigment;

import java.util.Scanner;

public class PrintOnScreen1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the number");
		int num[]=new int[size];
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println("Print on the Screen : "+num[i]);
		}

	}

}
