package basic;
import java.util.Scanner;
public class divisible_number {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number ::");
		sc.close();
		int number = sc.nextInt();
		if((number % 5 == 0) && (number % 10 == 0))
		{
			System.out.println(" The given number " + number + " is Divisible by 5 and 11");
		}
		else
			System.out.println(" The given number " + number + " is Not Divisible by 5 and 11");
	}

}
