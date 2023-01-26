package Question_Prectice;

import java.util.Scanner;

public class hw {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="RAINBOW";
		int flage=0;
		char ch[]=new char[7];
		System.out.println("1st :");
		ch[0]=sc.next().charAt(0);
		System.out.println("2nd:");
		ch[1]=sc.next().charAt(0);
		System.out.println("3rd:");
		ch[2]=sc.next().charAt(0);
		System.out.println("4th:");
		ch[3]=sc.next().charAt(0);
		System.out.println("5th:");
		ch[4]=sc.next().charAt(0);
		System.out.println("6th:");
		ch[5]=sc.next().charAt(0);
		System.out.println("7th:");
		ch[6]=sc.next().charAt(0);
		for(int i=0;i<7;i++) {
			if(s.charAt(i) != ch[i]) {
				flage=1;
			}
		}
		if(flage==0) {
			System.out.println("RAINBOW");
		}
		else
			System.out.println("Wrong");
		

	}

}
