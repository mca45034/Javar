package Arrays_Assigment;

import java.util.Scanner;

public class AlternatValue2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size");
			int size=sc.nextInt();
			System.out.println("Enter the number");
			int num[]=new int[size];
			for(int i=0;i<size;i++) {
				num[i]=sc.nextInt();
				
			}
			System.out.println("Alterant arry is : ");
			for(int i=0;i<size;i=i+2) {
				System.out.println(num[i]);
			}

	}

}
