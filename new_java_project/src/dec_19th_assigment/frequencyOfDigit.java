package dec_19th_assigment;

import java.util.Scanner;

public class frequencyOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num =sc.nextInt();
		int temp=num;
		int count=0;
		for(int i=0;i<num;i++) {
			while(temp>0) {
				int digit=num%10;
				if(digit==i) {
					count++;
				}
				temp=temp/10;
			}
			if(count>0) {
				System.out.println(i);
			}
		}
		

	}

}
