package dec_19th_assigment;
import java.util.Scanner;
public class odd_1ToN_number {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i %2 !=0) {
			 sum = sum+i;
			}
		}
           System.out.print("1 To N Between Odd No. : " +sum);
	}

}
