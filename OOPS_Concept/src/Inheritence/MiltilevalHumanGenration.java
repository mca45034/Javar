package Inheritence;
class GrandFather{
	String name;
	int age;
	GrandFather(String name,int age){
		this.name=name;
		this.age=age;
	}
	void Display() {
		System.out.println("GrandFather name is..."+name);
		System.out.println("GranFather age is..."+age);
	}
}
class Father extends GrandFather {
	String f_name;
	int f_age;
	public Father (){
		this("ShamSingh",50);
	}
	public Father(String f_name, int f_age) {
		super(f_name, f_age);
		this.f_name=f_name;
		this.f_age=f_age;
		
	}
    void display() {
    	super.Display();
    System.out.println("Father name is..."+f_name);
    System.out.println("Father age is..."+f_age);
    }
}
class Child extends Father {
	String name;
	int age;
	Child (){
		this("Ram",35);
	}
	public Child (String name,int age) {
		this.name=name;
		this.age=age;
	}
	void display() {
		super.display();
		System.out.println("Child name is.."+name);
		System.out.println("Child age is..."+age);
	}
}


public class MiltilevalHumanGenration {

	public static void main(String[] args) {
		Child c=new Child("Gopal",20);
		c.display();
		
	}

}
