package WrittenAssigment_31DEC;

import java.util.Scanner;

public class Assigment_7 {
	int id;
	String name;
	static String company_name;
	public void show(int id,String name) {
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println("Employe id is.."+id);
		System.out.println("Employe name is.."+name);
	}
	

	public static void main(String[] args) {
		company_name="----WEL COME TO CISCO PVT LTD----";
		System.out.println(company_name);
		Assigment_7 emply=new Assigment_7();
		Scanner sc=new Scanner(System.in);
		emply.id=1001;
		emply.name="Rahul Kirar";
		emply.display();

	}

}
