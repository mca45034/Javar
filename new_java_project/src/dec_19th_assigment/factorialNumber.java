package dec_19th_assigment;

import java.util.Scanner;

public class factorialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int fact =1;
		for(int i=1;i<=num;i++) {
			int rem=num%10;
			fact=fact*i;
		}
		System.out.println("the factorial : "+fact);
		
	}

}
