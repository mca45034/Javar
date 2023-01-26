package Arrays_type_2;

import java.util.Arrays;
import java.util.Scanner;

public class MoveNegativeNo {

	public static void main(String[] args) {
		//int arr[]= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the number");
		int num[]=new int[size];
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		Arrays.sort(num);
		for(int a:num) {
			System.out.print(" "+a);
		}

	}

}
