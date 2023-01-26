package Arrays_Assigment;

import java.util.Scanner;

public class PresentArry3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the number");
		int num[]=new int[size];
		int flage=0;
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
			
		}
		System.out.println("Serach the element");
		int s=sc.nextInt();
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(num[j]==s) {
					flage=1;
				}
				
			}
		}
		if(flage==1) {
			System.out.println("Elemnet present in given arrys");
		}
		else 
			System.out.println("Not present in given arry");

	}

}
