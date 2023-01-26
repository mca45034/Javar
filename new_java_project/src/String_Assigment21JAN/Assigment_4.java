package String_Assigment21JAN;

import java.util.Scanner;

public class Assigment_4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s="rahul kirar";
		int flage=0,count=0;
		System.out.println("Enter the charecter :");
		char ch=sc.next().charAt(0);
		char str[]=s.toCharArray();
		
		for(int i=0;i<str.length;i++) {
			if(str[i]==ch) {
			flage=1;
			count++;
			}
		}
		if(flage==1) {
			System.out.println(ch + " : Charecter is present.."+count);
		}
		else {
			System.out.println("Charecter is not present.."+count);
		}

	}

}
