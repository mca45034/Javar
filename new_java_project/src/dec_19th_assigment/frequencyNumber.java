package dec_19th_assigment;

import java.util.Scanner;

public class frequencyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = sc.nextInt();
		for(int i=0;i<9;i++) {
			int count=0,rem=0;
			int temp=num;
			while(temp>0) {
				rem=temp %10;
				if(rem==i) {
					count++;
				}
				temp=temp/10;
			}
			if(count>0) {
				System.out.println(i +" Frequence is " + count);
			}
		}
	}

}
