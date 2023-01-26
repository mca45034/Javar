package Arrays_type_2;

import java.util.Scanner;

public class SumOfSubArry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the number ");
		int num[]=new int[size];
		int count=0;
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("Sum of the Element : ");
		int s=sc.nextInt();
		for(int i=0;i<size;i++) {
			int sum=0;
			for(int j=i;j<size;j++) {
				sum=sum+num[j];
			}
			if(sum==s) {
				count++;
			}
		}
		System.out.println(count+" : pair is sum of element");

	}

}
