package Arrays_Assigment;

import java.util.Scanner;

public class Assigment16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the number");
		int num[]=new int[size];
		//int sum=10;
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
			
		}
		System.out.println("value of the sum : ");
		int sum=sc.nextInt();
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				
				if(num[i]+num[j]==sum) 
				{
				int add=num[i]+num[j];
					System.out.println(num[i]+" + "+num[j]+" = "+add);
				}
			}
		}
		
//		int sum=10;
//		int arr[]= {4, 6, 5, -10, 8, 5, 20};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				
//				if(arr[i]+arr[j]==sum) 
//				{
//				int 	add=arr[i]+arr[j];
//					System.out.println(arr[i]+" "+arr[j]+"="+add);
//				}
//			}
//		}
		

	}

}
