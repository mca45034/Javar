package Assigment_ArraysMethod;

import java.util.Scanner;

public class Assigment_6 {
	static void sort(Student123 stu[]) {
		for(int i=0;i<stu.length;i++) {
			for(int j=i+1;j<stu.length;j++) {
				if(stu[i].getMarks()<stu[j].getMarks()) {
					int temp=stu[i].marks;
					stu[i].marks=stu[j].marks;
					stu[j].marks=temp;
					
					String temp1=stu[i].name;
					stu[i].name=stu[j].name;
					stu[j].name=temp1;
					
					int temp2=stu[i].roll_no;
					stu[i].roll_no=stu[j].roll_no;
					stu[j].roll_no=temp;
				
				}
			}
		}
	}

	public static void main(String[] args) {
		Student123[] stu=new Student123[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<stu.length;i++) {
			System.out.println("Enter the id");
			int id=sc.nextInt();
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the marks");
			int mark=sc.nextInt();
			stu[i]=new Student123();
			stu[i].setRoll_no(id);
			stu[i].setName(name);
			stu[i].setMarks(mark);
		}
		for(int i=0;i<stu.length;i++)
		{
			
			System.out.println(stu[i].getRoll_no() +" "+stu[i].getName()+" "+stu[i].getMarks());
		}
		sort(stu);
		
		for(Student123 st:stu)
		{
			System.out.println(stu);
		}
	}

}
