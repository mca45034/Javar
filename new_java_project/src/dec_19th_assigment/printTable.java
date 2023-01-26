package dec_19th_assigment;

import java.util.Scanner;

public class printTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number  : ");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++) {
			int table=num*i;
			System.out.println(i + " X " + num +" = " +table);
		}
		
	}

}
