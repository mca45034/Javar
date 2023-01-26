package Arrays_Assigment;

import java.util.Scanner;

public class Assigment13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("ENter the String name");
		String str[]=new String[size];
		for(int i=0;i<size;i++) {
			str[i]=sc.next();
		}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j>size;j++) {
				if(str[i].charAt(0)<str[j].charAt(0)) {
					String tmp=str[i];
					str[i]=str[j];
					str[j]=tmp;
				}
			}
		}
		for(String s : str) {
			System.out.println(s);
		}
	}

}
