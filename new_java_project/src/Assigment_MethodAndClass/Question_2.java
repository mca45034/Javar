package Assigment_MethodAndClass;

public class Question_2 {
	String name;
	String cours;
	int age;
	Question_2(String n,String c,int a){
		name=n;
		cours=c;
		age=a;
		
	}
	void diplay() {
		System.out.println("Student name is..."+name);
		System.out.println("Student course is.."+cours);
		System.out.println("Student age is..."+age);
	}
	String getName() {
		return name;
	}

}
