package ArraysBasic;

import java.util.Scanner;

public class SmallValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the number");
		int num[]=new int[size];
		int min=num[0];
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}   
	        int min1 = num[0];  
	        for (int i = 0; i < size; i++) {    
	           if(num[i] < min1)  
	               min1 = num[i];  
	        }    
	        System.out.println("Largest element present in given array: " + min1); 

	}

}
