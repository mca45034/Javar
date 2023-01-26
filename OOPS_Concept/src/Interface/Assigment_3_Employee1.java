package Interface;
interface emp{
	public default void emp1() {
		System.err.println("Interface class");
	}
	void details();
}
interface Company{
	void Companydetails();
}
class EmpDetails implements emp{
	int id;
	String name;
	String department;
	int selary;
	 EmpDetails(int id,String name,String department,int selary){
		 this.id=id;
		 this.name=name;
		 this.department=department;
		 this.selary=selary;
	 }

	@Override
	public void details() {
		System.err.println("Employee Details....");
		System.out.println("Employe ID is..."+id);
		System.out.println("Employ name is..."+name);
		System.out.println("Employ department is..."+department);
		System.out.println("Employ selary is..."+selary);
		
	}
	
}
class Company1 implements Company{
	String name;
	String location;
	int c_number;
	Company1(String name,String location,int c_number){
		this.name=name;
		this.location=location;
		this.c_number=c_number;
	}

	@Override
	public void Companydetails() {
		System.err.println("Company full details...");
		System.out.println("Company name is..."+name);
		System.out.println("Company location is..."+location);
		System.out.println("Company contect number is..."+c_number);
		
	}
	
}

public class Assigment_3_Employee1 {

	public static void main(String[] args) {
		emp a;
		a=new EmpDetails(201, "Rahul Kirar", "I.T", 50000);
		a.details();
		a.emp1();
		Company c;
		System.out.println("--------------------------------------");
		c=new Company1("Microsoft", "Delhi", 46546531);
		c.Companydetails();
		

	}

}
