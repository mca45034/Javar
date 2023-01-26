package class_object;

import java.util.Scanner;

public class MaximumNoClass {
	void maximum(int num) {
		int max=num%10;
		num=num/10;
		while(num>0) {
			int rem=num%10;
			if(rem>max) {
				max=rem;
			}
			num=num/10;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		MaximumNoClass max=new MaximumNoClass();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		max.maximum(num);

	}

}
