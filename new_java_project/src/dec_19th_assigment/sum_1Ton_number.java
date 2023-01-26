package dec_19th_assigment;
import java.util.Scanner;
public class sum_1Ton_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the natural no. = ");
		int num = sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) {
			if(i%2 ==0) {
			sum=sum+i;
			}
		}
		System.out.print("the sum of 1 to N natural number = " + sum);

	}

}
