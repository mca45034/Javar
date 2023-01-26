package Assigment_24Dec;

import java.util.Scanner;


public class Rainbow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s="RAINBOW";
		int flage=0;
		char ch[]=new char[7];
		System.out.println("Enter the first letter: ");
		ch[0]=sc.next().charAt(0);
		System.out.println("Enter the second letter: ");
		ch[1]=sc.next().charAt(0);
		System.out.println("Enter the third letter: ");
		ch[2]=sc.next().charAt(0);
		System.out.println("Enter the fourth letter: ");
		ch[3]=sc.next().charAt(0);
		System.out.println("Enter the fifth letter: ");
		ch[4]=sc.next().charAt(0);
		System.out.println("Enter the sixth letter: ");
		ch[5]=sc.next().charAt(0);
		System.out.println("Enter the seventh letter: ");
		ch[6]=sc.next().charAt(0);
		for(int i=0;i<7;i++) {
			if(s.charAt(i) !=ch[i]) {
			flage=1;
			
			}
		}
		if(flage==0) {
		System.out.println("RAINBOW");	
		}
		else
			System.out.println("Wrong Spelling");
	}

}
