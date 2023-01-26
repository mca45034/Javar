package WrittenAssigment_31DEC;

import java.util.Scanner;

public class Assigment_6 {

	public static void main(String[] args) {
		String m = "yes";
		String m1 = null;
		Student_6 s=new Student_6();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student ID : ");
		s.setStudentId(sc.nextInt());
		System.out.println("Enter the Student Name : ");
		s.setStudentName(sc.next());
		System.out.println("Student Address is : ");
		s.setStudentAddress(sc.next());
		System.out.println(" student belongs to NIT ");
		s.setCollegeName(sc.next());
		if(s.equals(m)) {
			System.out.println("Yes student belongs to NIT"+s.getCollegeName());
		}
		else {
			System.out.println("Enter the college name : ");
			 m1=sc.next();
			
			
		}
		System.out.println("College name is.."+m1);
		

	}

}
