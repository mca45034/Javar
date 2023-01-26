package Assigment_MethodAndClass;

public class Question_4 {
	String name;
	String course;
	int age;
	int id;
	{
		System.out.println("----WELCOME TO SCHOOL----");
	}
	void Question_4() {
		name="Sham";
		course="BCA";
		age=20;
		id=030;
		display();
	}
	void display() {
		System.out.println("Student name is..."+name);
		System.out.println("Student course is..."+course);
		System.out.println("Student age is..."+age);
		System.out.println("Student Id is..."+id);
	}

	public static void main(String[] args) {
		
		Question_4 m=new Question_4();
		//m.display();
	}

}
