package Assigment_24Dec;

import java.util.Scanner;

public class Rainbow1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first letter: ");
	char	ch0=sc.next().charAt(0);
		System.out.println("Enter the second letter: ");
		char ch1=sc.next().charAt(0);
		System.out.println("Enter the third letter: ");
		char ch2=sc.next().charAt(0);
		System.out.println("Enter the fourth letter: ");
		char ch3=sc.next().charAt(0);
		System.out.println("Enter the fifth letter: ");
		char ch4=sc.next().charAt(0);
		System.out.println("Enter the sixth letter: ");
		char ch5=sc.next().charAt(0);
		System.out.println("Enter the seventh letter: ");
		char ch6=sc.next().charAt(0);
		
		String res=(ch0=='R' && ch1=='A' && ch2=='I' && ch4=='N' && ch3=='B' && ch5=='O' && ch6=='W')?"RAINBOW":"Splelling in crect";
		System.out.println(res);
    
	}

}
