package Assigment_ArraysMethod;

import java.util.Scanner;

public class Assigment_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of String");
		int size=sc.nextInt();
		System.out.println("Enter the String name");
		String[] stAr=new String[size];
		for(int i=0;i<size;i++) {
			stAr[i]=sc.next();
		}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(stAr[i].charAt(0)>stAr[j].charAt(0)) {

				
				String tmp=stAr[i];
				stAr[i]=stAr[j];
				stAr[j]=tmp;
				}
			}
		}
		for(String s:stAr) {
			System.out.println(s);
		}

	}

}
