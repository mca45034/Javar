package Arrays_type_2;

import java.util.Scanner;

public class Occurrences {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int num[]=new int[size];
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
//		int arr[]= {1, 1, 2, 2, 2, 2, 3,};
//		int x=2;
		System.out.println("Enter the number of Frequncy");
		int frequency=sc.nextInt();
		int count=0;
		for(int i=0;i<size;i++) {
			if(num[i]==frequency) {
				count++;
			}
		}
		System.out.println("Count number of occurrences : "+count);

	}

}
