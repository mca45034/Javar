package dec_19th_assigment;
import java.util.Scanner;
public class calculateProductOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number  =");
		int num = sc.nextInt();
		int product=1;
		while(num>0) {
			int digit = num%10;
			 product = product *digit;
			num=num/10;
		}
		System.out.print("product of digit = " + product);
	}

}
