package Assigment_7Jun;

import java.util.Scanner;

public class Assigment_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("How many raifall days temperatures");
        int numDays = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= numDays; i++) {
        System.out.print("Day " + i + "'s high temp: ");
           int next = sc.nextInt();
           sum =sum + next;
       }
      double average = (double) sum / numDays;
        System.out.println();
      System.out.println("Average = " + average);

	}

}
