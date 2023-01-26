package Assigment_MethodAndClass;

public class Question_5 {
	String name;
	int password;
	{
		System.out.println("----EMPLOYEE INFORMATION----");
	}
	Question_5(){
		name="Gopal";
		password=12345;
	}
	void display() {
	  System.out.println("Employee name is..."+name);
	  System.out.println("Employee password is..."+password);
	}

	public static void main(String[] args) {
		Question_5 e=new Question_5();
		e.display();
		Question_5 e1=new Question_5();
		e1.name=e.name;
		e1.password=e.password;
		e1.display();

	}

}
