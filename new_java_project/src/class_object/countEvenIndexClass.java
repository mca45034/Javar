package class_object;

import java.util.Scanner;

public class countEvenIndexClass {
	void count(int num) {
		
		int count=0,sum=0;
		while(num>0) {
			int rem=num%10;
			for(int i=1;i<=rem;i=i+2) {
			count++;
			sum=sum+rem;
			num=num/10;
			}
			System.out.println("index: "+count);
		}
		
		}

	public static void main(String[] args) {
		countEvenIndexClass c=new countEvenIndexClass();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		c.count(num);
		
          
	}

}
