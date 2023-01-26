package basic;

import java.util.Scanner;

public class pettern_number_Print {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number  : ");
		int num=sc.nextInt();
		int i,j;
		for(i=0;i<=num;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}

	}

}
