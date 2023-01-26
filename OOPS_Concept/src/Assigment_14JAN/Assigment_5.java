package Assigment_14JAN;

import java.util.Scanner;

public class Assigment_5 {

	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		Theatre[] t=new Theatre[3];
		for(int i=0;i<t.length;i++) {
			System.out.println("Enter the theatre id");
			int theatreid=sc.nextInt();
			System.out.println("Enter the theatre name");
			String theatrename=sc.next();
			System.out.println("Enter the theatre location");
			String location=sc.next();
			System.out.println("Enter the movieid");
			int movieid=sc.nextInt();
			System.out.println("Enter the moviename");
			String moviename=sc.next();
			System.out.println("Enter the movie rating");
			int rating=sc.nextInt();
			Movie mv=new Movie(movieid, moviename, rating);
			t[i]=new Theatre(theatreid, theatrename, location,mv);
			for(int i1=0;i1<t.length;i1++) {
				for(int j=i+1;j<t.length;j++) {
					if(t[i].m.Rating < t[j].m.Rating){
						double temp=t[i].m.Rating;
						t[i].m.Rating=t[j].m.Rating;
						t[j].m.Rating=temp;
					}
				}
				System.out.println(t[i]);
			}
		}
//		for(Theatre it:t) {
//			System.out.println(it);
//		}
		

	}


}
