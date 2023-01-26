package dec_19th_assigment;

import java.util.Scanner;

public class milkAndOilQuantity {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum=0;
	while(true) {
		System.out.println("Enter Milk Quntity :");
		int m_Quntity = sc.nextInt();
		System.out.println("Enter Oil Quntity :");
		int o_Quntity = sc.nextInt();
	      sum = m_Quntity * 40 + o_Quntity * 50;
	
	  
	while(sum>500)
	{
		break;
	}
	System.out.println(sum);

	}
	}

}
