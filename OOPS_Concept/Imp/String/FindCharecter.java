package String;

import java.util.Scanner;

public class FindCharecter {

	public static void main(String[] args) {
		int flag=0;
		int count=0;
		String s="java programming";
		char[] ch=s.toCharArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char...");
		char ch1=sc.next().charAt(0);
		for(int i=0;i<s.length();i++) {
			if(ch1==ch[i]) {
				flag=1;
				count++;
			}
		}
		if(flag==1) {
			System.out.println("Given charecter is present.."+count);
		}
		else
		{
			System.out.println("Not present");
		}
        
	}

}
