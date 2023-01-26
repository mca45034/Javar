package dec_19th_assigment;

import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
	int armstrong=0;
	int temp=num;
	while(num>0) {
		int rem=num%10;
		armstrong=armstrong+(rem*rem*rem);
		num=num/10;
	}
	if(temp==armstrong) {
		System.out.println("This is Armstrong number : " +armstrong);
	}
	else
		System.out.println("This is not armstrong number : " + armstrong);

	}

}
