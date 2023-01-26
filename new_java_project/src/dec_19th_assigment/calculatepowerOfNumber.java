package dec_19th_assigment;
import java.util.Scanner;
public class calculatepowerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter trhe value :");
		int value=sc.nextInt();
		System.out.print("Enter the power : ");
		int power=sc.nextInt();
//		int value=2;
//		int power=4;
		int result=1;
		while(power > 0) {
			result=result*value;
			power--;
		}
		System.out.println(result);
	}

}
