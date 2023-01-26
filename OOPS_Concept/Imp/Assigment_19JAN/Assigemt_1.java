package Assigment_19JAN;

import java.util.Scanner;

public class Assigemt_1 {

	public static void main(String[] args) {
		String s="Program to find occurrence of a character in a string";
		Scanner sc=new Scanner(System.in);
		char ch[]=s.toCharArray();
		int fleg=0;
		int count=0;
		System.out.println("Ente the occurrence character : ");
		char ch1=sc.next().charAt(0);
		for(int i=0;i<s.length();i++) {
			if(ch1==ch[i]) {
				fleg=1;
				count++;
			}
		}
		if(fleg==1) {
			System.out.println("occurrence og char " +ch1+ "in the String : "+count);
		}
		else {
			System.out.println("Not occurrence of a character");
		}

	}

}
