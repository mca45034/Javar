package Arrays_Assigment;

import java.util.Scanner;

public class SumAndProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the number");
		int num[]=new int[size];
		int sum=0;
		int multipal=1;
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		
		}
		for(int i=0;i<=size;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of given arry : "+sum);
		for(int i=1;i<=size;i++) {
			multipal=multipal*i;
		}
		System.out.println("Produt og given arry : "+multipal);
		
	
	}

}
