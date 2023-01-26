package class_object;

public class StudentDetails {
	String s_name;
	int s_id;
	float per;
	void addStudent(String name, int id,float p ){
		s_name=name;
		s_id=id;
		per=p;
	}
	void print() {
		System.out.println("Student name..."+s_name);
		System.out.println("Student Id..."+s_id);
		System.out.println("Student percentage.."+per);
	}
	public static void main(String[] args) {
		StudentDetails l=new StudentDetails();
		l.addStudent("Rahul",101, 90);
		l.print();
		System.out.println("-------------------------");
		StudentDetails m=new StudentDetails();
		m.addStudent("Nitish",102, 93);
		m.print();
		System.out.println("------------------------------");
		StudentDetails n=new StudentDetails();
		n.addStudent("Ankit",103, 95);
		n.print();
		System.out.println("-------------------------------");
		StudentDetails o=new StudentDetails();
		o.addStudent("Ashsish",104, 85);
		o.print();
		
		

	}

}
