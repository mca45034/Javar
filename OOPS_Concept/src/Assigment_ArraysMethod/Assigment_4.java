package Assigment_ArraysMethod;

import java.util.Scanner;

class Student1{
	int roll;
	String name;
	int age;
	int marks;
	public Student1(int roll, String name, int age, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student1 [roll=" + roll + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
}

public class Assigment_4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		Student1[] stu=new Student1[size];
		for(int i=0;i<stu.length;i++) {
			System.out.println("Enter student roll number");
			int roll=sc.nextInt();
			System.out.println("Enter the student name");
			String name=sc.next();
			System.out.println("Enter the student age");
			int age=sc.nextInt();
			System.out.println("Enter the Student marks");
			int marks=sc.nextInt();
			if(marks>=60 && age<=15) {
			stu[i]=new Student1(roll, name, age, marks);
			}
			
		}
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i]);
		}

	}

}
