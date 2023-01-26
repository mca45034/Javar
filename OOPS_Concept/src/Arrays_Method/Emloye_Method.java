package Arrays_Method;

import java.util.Scanner;

class Employe {
	int id;
	String name;
	String department;
	int age;
	Employe(int id,String name,String department,int age){
		this.id=id;
		this.name=name;
		this.department=department;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", department=" + department + ", age=" + age + "]";
	}
	
}
public class Emloye_Method {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of person");
		int number=sc.nextInt();
		Employe employe[]=new Employe[number];
		for(int i=0;i<employe.length;i++) {
			System.out.println("Enter the Employe ID: ");
			int id=sc.nextInt();
			System.out.println("Enter the Employe Name : ");
			String name=sc.next();
			System.out.println("Enter the Employe department : ");
			String department=sc.next();
			System.out.println("Enter the Employe Age : ");
			int age=sc.nextInt();
			employe[i]=new Employe(id,name,department,age);
		}
		for(Employe e:employe) {
			System.out.println(e);
		}
		
	
	}

}
