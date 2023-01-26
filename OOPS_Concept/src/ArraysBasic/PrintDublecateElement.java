package ArraysBasic;

import java.util.Scanner;

public class PrintDublecateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size");
		int size=sc.nextInt();
		System.out.print("Enter the number");
		int num[]=new int[size];
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(num[j]==num[i]) {
					System.out.println(num[j]);
				}
			}
		}

	}

}
