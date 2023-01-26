package Arrays_Assigment;

import java.util.Scanner;

public class Assigment7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the number");
		int num[]=new int[size];
		int flage=0;
		int count=0;
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<size/2;i++) {
			for(int j=size-1;j>=0;j--) {
				if(num[i]==num[j] ){
					flage=1;
					count++;
				}
			}
		}
		if(flage==1 && count==size-1/2) {
			System.out.println("sum of value present");
		}
		else
			System.out.println("nor present");
		for(int i=0;i<size/2;i++) {
			for(int j=size-1;j>=0;j--) {
				if(num[i]==num[j] ){
					int add=num[i]+num[j];
					System.out.println(add);
					break;
				}
			}
		}
	}
	

}
