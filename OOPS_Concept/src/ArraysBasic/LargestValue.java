package ArraysBasic;

import java.util.Scanner;

public class LargestValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the number");
		int num[]=new int[size];
		int max=num[0];
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}   
	        int max1 = num[0];  
	        for (int i = 0; i < size; i++) {    
	           if(num[i] > max1)  
	               max1 = num[i];  
	        }    
	        System.out.println("Largest element present in given array: " + max1); 

	}

}
