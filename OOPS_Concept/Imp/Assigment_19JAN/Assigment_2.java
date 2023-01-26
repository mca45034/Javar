package Assigment_19JAN;

import java.util.Scanner;

public class Assigment_2 {

	public static void main(String[] args) {
		//String s="RahulKirar";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.next();
		int count=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			count++;
		}
		System.out.println(" count occurrences of a character in given string : "+count);

	}

}
