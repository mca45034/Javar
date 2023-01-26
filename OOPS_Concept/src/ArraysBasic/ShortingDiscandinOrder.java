package ArraysBasic;

import java.util.Scanner;

public class ShortingDiscandinOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the number");
		int num[]=new int[size];
		int temp=0;
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(num[i]<num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<size;i++) {
			System.out.println(num[i]+" ");
		}

	}

}
