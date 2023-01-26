package Assigment_MethodAndClass;

public class Student7Question {
	String name;
	int id;
	int mob;
	Student7Question (){
		
	}
	Student7Question(String n,int i,int m){
		name=n;
		id=i;
		mob=m;
	}
	void display() {
		System.out.println("Student name is.."+name);
		System.out.println("Stident id is.."+id);
		System.out.println("Stident mobile number is .."+mob);
	}
	
	public static void main(String[] args) {
		Student7Question s=new Student7Question("Pankaj",420,2345670);
		s.display();
		System.out.println("-------------");
		Student7Question s1=new Student7Question();
		s1.name=s.name;
		s1.id=s.id;
		s1.mob=s.mob;
		s1.display();

	}

}
